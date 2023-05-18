package com.velalar.staffms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velalar.staffms.dto.StaffDto;
import com.velalar.staffms.model.StaffCollection;
import com.velalar.staffms.repository.StaffRepo;
import com.velalar.staffms.service.StaffService;

@Service(value = "staffServiceImpl")
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepo staffRepo;
	
	@Override
	public List<StaffDto> getStaffs() {
		List<StaffDto> staffDtos = new ArrayList<>();
		List<StaffCollection> staffCollections = staffRepo.findAll();
		staffCollections.forEach((staff) -> {
			StaffDto staffDto = new StaffDto();
			staffDto.setName(staff.getName());
			staffDto.setAge(staff.getAge());
			staffDto.setEmail(staff.getEmail());
			staffDtos.add(staffDto);
		});
		return staffDtos;
	}
}
