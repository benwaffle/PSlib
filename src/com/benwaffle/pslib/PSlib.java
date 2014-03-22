package com.benwaffle.pslib;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import powerschool.rest.publicportal.PublicPortalServiceJSON;
import powerschool.rest.publicportal.PublicPortalServiceJSONPortType;
import powerschool.rest.vo.xsd.*; // data types


public class PSlib {
	// soap service to get endpoints
	private final static PublicPortalServiceJSON svc;
	
	static {
		Log.d("setting http basic auth creds");
		// set http basic auth
		Authenticator.setDefault(new Authenticator() { 
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(
						"pearson", "m0bApP5".toCharArray());
			}
		});
		
		Log.d("instantiating PublicPortalService");
		svc = new PublicPortalServiceJSON();
	}
	
	private final static String
		API_PATH = "/pearson-rest/services/", // path to api on server
		SERVICE = "PublicPortalServiceJSON"; // SOAP service name

	// base URL of powerschool server
	private String server = null;

	// SOAP endpoint
	private PublicPortalServiceJSONPortType endpt = null; 

	// Current session; non-null when logged in
	private UserSessionVO session = null;
	
	// Student's data; non-null after call to endpoint.getStudentData()
	private StudentDataVO studentData = null;
	
	public PSlib(String server) {
		this.server = server;

		// use https & soap 1.1
		Log.d("Getting endpoint");
		if (server.startsWith("https"))
			endpt = svc.getPublicPortalServiceJSONHttpsSoap11Endpoint();
		else 
			endpt = svc.getPublicPortalServiceJSONHttpSoap11Endpoint();
		Log.d("done getting endpoint");

		Log.d("setting endpoint address");
		// all requests should be sent to the server
		((BindingProvider) endpt).getRequestContext()
				.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
						this.server + API_PATH + SERVICE);
	}

	public void login(String username, String password) throws Exception {
		Log.d("logging in");
		// userType = 2; likely different for teachers, parents, etc
		session = endpt.login(username, password, 2).getUserSessionVO();
		Log.d("done logging in");
		
		
		if (session == null)
			throw new Exception("Error logging in");
		
		Log.d("getting student data");
		ResultsVO response = endpt.getStudentData(
				session,
				java.util.Arrays.asList(session.getUserId()),
				new QueryIncludeListVO(){{
					getIncludes().add(1); // 1 -> all
				}});
		studentData = response.getStudentDataVOs().get(0); // not (yet?) for parents
		Log.d("got all data");
	}
	
	public StudentDataVO getStudentData(){
		return studentData;
	}
	
	public Map<String, String> getGrades(){
		if (studentData == null)
			return null;
		
		Map<Long, String> tmp = new HashMap<Long, String>(); //<id, name>
		Map<String, String> map = new HashMap<String, String>(); //<name, grade>		
		
		for (AssignmentVO asmt : studentData.getAssignments())
			tmp.put(asmt.getId(), asmt.getName());
		
		for (AssignmentScoreVO score : studentData.getAssignmentScores())
			map.put(tmp.get(score.getAssignmentId()), score.getPercent());
		
		return map;
	}
}
