package com.jala.sys.service;

import com.jala.sys.model.UpmsSystem;

public interface UpmsSystemService {

	int updateByPrimaryKeySelective(UpmsSystem upmsSystem);
	
	UpmsSystem selectByPrimaryKey(int id);
	
	int deleteByPrimaryKeys(String ids);
	
	int insertSelective(UpmsSystem upmsSystem);
}
