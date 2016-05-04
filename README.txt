DEMO For Spring Security OAuth2, separate Authorization Server and Resource Server
	stack:
		Java 8,Spring Boot 1.3.3,Spring Security with OAuth2,Spring Web(undertow)

	spring-oauth2-as: Authorization Server
	
	spring-oauth2-rs: Resource Server
	
Verify:
	1. Prepare REDIS instance to 127.0.0.1
	
	2. Startup Authorization Server: run com.orwen.springoauth2.bootstrap.Bootstrap
	3. Startup Resource Server: run com.orwen.springoauth2.rs.bootstrap.Bootstrap
	
	4. Retrieve access token from Authorization Server with password grant type: curl client:secret@127.0.0.1:1184/as/oauth/token -d grant_type=password -d username=admin -d scope=read -d password=password
	
	5. Access Protected resource/Resource Server: curl http://127.0.0.1:1185/rs/rest/v1/protected/echo/feed?access_token=7a5f4a48-599d-4514-a6ec-83e550a12ef2 # access_token=7a5f4a48-599d-4514-a6ec-83e550a12ef2 come from step 4.
