package com.example.springboot;

import com.example.springboot.exception.XMLNotBuiltGoodException;
import com.example.springboot.service.QADService;
import com.example.springboot.wsdl.mapping.WmEnvioTransaccionesResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.SOAPException;

@RestController
public class HelloController 
{
	@Autowired
	private QADService qadService;

	public HelloController() {
		this.qadService = new QADService();
	}

	@GetMapping("/enviartransacion")
	public String index() {
		return this.qadService.getQADInfo();
	}

}
