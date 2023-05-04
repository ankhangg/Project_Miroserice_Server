package com.ankhang.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankhang.entities.Info;
import com.ankhang.model.InfoModel;
import com.ankhang.repository.InfoRepository;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@SneakyThrows
    public InfoModel getInfoById(Long id) {
		//emulator the case timeout
//    	log.info("Wait Start");
//			Thread.sleep(5000); //5s
//    	log.info("Wait End");
    	
    	Info info = infoRepository.findInfoById(id);
    	
    	InfoModel infoModel = mapper.map(info, InfoModel.class);
    	
    	System.out.println("---Method Calling Server---");
    	
    	return infoModel;
    }
	

}
