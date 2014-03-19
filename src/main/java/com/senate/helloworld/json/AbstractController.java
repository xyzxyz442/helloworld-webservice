package com.senate.helloworld.json;

import org.springframework.http.HttpHeaders;

public abstract class AbstractController {
	protected HttpHeaders headers;

	public AbstractController() {
		this.headers = new HttpHeaders();
		this.headers.add("Access-Control-Allow-Origin", "*");
		this.headers.add("Access-Control-Allow-Methods", "GET, POST");
	}
}
