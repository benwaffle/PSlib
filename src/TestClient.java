import java.io.IOException;

import com.benwaffle.pslib.Log;
import com.benwaffle.pslib.PSlib;

public class TestClient {
	public static void main(String[] args) {
		Log.logLvl = Log.Level.DEBUG;
		
		PSlib api = new PSlib("https://ps01.bergen.org");
		try {
			api.login("beniof", "");
		} catch (Exception e) {
			System.out.println("Wrong username or password!");
			return;
		}

		while(true){
			try {
				System.in.read();  // block until enter key pressed
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			new Work(api).run();
			System.out.println("---------------------------");
		}
	}
}

//run in debug mode under eclipse, can change code on the fly
class Work implements Runnable {
	PSlib api; 
	
	public Work(PSlib api) { this.api = api; }
	public void run() {
		
	}
}
