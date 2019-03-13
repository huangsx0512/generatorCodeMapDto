package com.tsingning.worksite.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsingning.worksite.dao.mapper.RecFolderMapper;
import com.tsingning.worksite.service.IRecFolderService;

@Service
public class RecFolderServiceImpl implements IRecFolderService { 
	
	@Autowired
	private RecFolderMapper recFolderMapper;
	
}