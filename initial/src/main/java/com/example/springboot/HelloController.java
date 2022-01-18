package com.example.springboot;

import com.example.springboot.service.QADService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		try {
			this.qadService.getQADInfo();
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "FAIL";
	}

	@GetMapping("/enviarTransactionCallBack")
	public String enviarCallBack() {
		try {
			this.qadService.reportes();
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "FAIL";
	}

	@GetMapping("/reportes")
	public String reportes() {
		try {
			this.qadService.reportes();
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "FAIL";
	}


	@GetMapping("/reportesCallBack")
	public String reportesCallBack() {
		try {
			this.qadService.reportes();
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "FAIL";
	}
	

}
