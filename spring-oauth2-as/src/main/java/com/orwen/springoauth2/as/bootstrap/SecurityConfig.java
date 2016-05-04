package com.orwen.springoauth2.as.bootstrap;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 
 * @author orwen
 *
 */

/**
 * Spring Security and OAuth2 AuthorizationServer java configure
 */
@Configuration
public class SecurityConfig {
	@Configuration
	@EnableWebSecurity
	public static class InnerSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers("/oauth/check_token");
		}

		@Override
		public void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().anyRequest().authenticated();
		}
	}

	@Configuration
	@EnableAuthorizationServer
	public static class OAuth2ServerConfig {

	}

}
