package com.ankhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ankhang.model.InfoModel;
import com.ankhang.service.InfoService;

@RestController
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@GetMapping("/infos/{id}")
	ResponseEntity<InfoModel> getInfoDetail(@PathVariable("id") Long id){
		InfoModel infoModel = infoService.getInfoById(id);
		return ResponseEntity.status(HttpStatus.OK).body(infoModel);
	}
}
