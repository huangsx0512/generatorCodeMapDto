<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.dao.mapper.${className}Mapper;
import ${basepackage}.service.I${className}Service;

@Service
public class ${className}ServiceImpl implements I${className}Service { 
	
	@Autowired
	private ${className}Mapper ${classNameLower}Mapper;
	
}