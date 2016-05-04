package com.orwen.springoauth2.rs.bootstrap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Verify Restful interface
 * 
 * @author orwen
 *
 */
@ResponseBody
@RestController
@RequestMapping("/rest/v1/protected")
public class ProtectedResourceRestController {

	@RequestMapping(method = RequestMethod.GET, path = "/echo/{message}")
	public ResponseEntity<String> echo(@PathVariable("message") String message) {
		return ResponseEntity.ok(message);
	}
}
