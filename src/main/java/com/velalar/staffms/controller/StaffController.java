package com.velalar.staffms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velalar.staffms.dto.StaffDto;
import com.velalar.staffms.service.StaffService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class StaffController {
	
	@Autowired
	private StaffService staffService;

	@GetMapping(value = "/staffs")
	public ResponseEntity<List<StaffDto>> getStaffs() {
		return new ResponseEntity<List<StaffDto>>(staffService.getStaffs(), HttpStatus.OK);
	}
}
