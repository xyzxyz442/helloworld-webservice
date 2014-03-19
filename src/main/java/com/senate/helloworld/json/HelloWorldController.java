package com.senate.helloworld.json;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senate.data.OutputData;

@Controller
public class HelloWorldController extends AbstractController {
	
	@RequestMapping(value = "/helloWorld.json", method = RequestMethod.GET)
	public ResponseEntity<OutputData> helloWorld() {
		OutputData outputData = new OutputData();
		outputData.setData("HelloWorld");
		
		return new ResponseEntity<OutputData>(outputData, headers, HttpStatus.OK);
	}
}
