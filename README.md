# VBI_MUSIC_APP

# Deliverables

VBI_Music_App/Deliverables/APIs_list.pdf - Has the list of APIs with the route, method, body, sample response and description.
VBI_Music_App/Deliverables/Schema_diagram.jpeg - Has the DB schema diagram.

# Login Details
Username - Sam

Password - admin

# Execution Steps
1. Download vbiapp.war from https://drive.google.com/file/d/13K996Hm2iTwPLgA5J2NmPRe5q6ukO70L/view?usp=sharing
2. Download and install apache tomcat - https://tomcat.apache.org/download-90.cgi
3. Place the vbiapp.war at $CATALINA_HOME/webapps
4. Start tomcat for deploying the application using the below command.
      $CATALINA_HOME/bin/startup.sh
5. Context will begin as http://localhost:<port>/vbiapp
6. When prompted, login using the login credentials mentioned above.
6. Access each of the API using this URL, for ex: http://localhost:<port>/vbiapp/allsongs 
