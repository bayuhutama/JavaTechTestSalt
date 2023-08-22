package com.MiniProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.Models.Model;
import com.MiniProject.Services.Services;

@RestController
@RequestMapping(value = "api/mail/")
public class ControllerRest {

	@Autowired
	private Services s;
	
	@PostMapping(value = "insertData")
	public void insertData(@RequestBody Model m) {
		s.insertData(m.getName(), m.getAlamat(), m.getKota(), m.getProvinsi(),m.getTgl_registrasi(), m.getStatus());
		
	}
	
	@PostMapping(value = "dataByName")
	public void dataByName(@RequestBody Model m) {
		s.dataByName(m.getName());
		
	}
	
	@PostMapping(value = "dataByAlamat")
	public void dataByAlamat(@RequestBody Model m) {
		s.dataByAlamat(m.getAlamat());
		
	}
	
	@PostMapping(value = "dataByKota")
	public void dataByKota(@RequestBody Model m) {
		s.dataByKota(m.getKota());
		
	}
	
	@PostMapping(value = "dataByProvinsi")
	public void dataByProvinsi(@RequestBody Model m) {
		s.dataByProvinsi(m.getProvinsi());
		
	}
	
	@PostMapping(value = "dataByTgl")
	public void dataByTgl(@RequestBody Model m) {
		s.dataByTgl(m.getTgl_registrasi());
		
	}
	
	@PostMapping(value = "dataByStatus")
	public void dataByStatus(@RequestBody Model m) {
		s.dataByStatus(m.getStatus());
		
	}
}
