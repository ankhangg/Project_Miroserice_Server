package com.ankhang.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankhang.entities.Info;
import com.ankhang.model.InfoModel;
import com.ankhang.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;
	
	@Autowired
	private ModelMapper mapper;
	
    public InfoModel getInfoById(Long id) {
    	Info info = infoRepository.findInfoById(id);
    	
    	InfoModel infoModel = mapper.map(info, InfoModel.class);
    	
    	System.out.println("---Method Calling---");
    	
    	return infoModel;
    }
	

}
