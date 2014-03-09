PSlib
=====

A Java library for interfacing with PowerSchool.

Example
----------
```Java
PSlib api = new PSlib("https://ps01.bergen.org");
api.login("username","password");
Grade[] grades = api.getCourses()[0].getGrades();

for (Grade g : grades)
  System.out.printf("%s - %d%%", g.name(), g.score());
```
