package com.jala.sys.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jala.sys.model.UpmsSystem;

@RequestMapping("/user")  
@Controller 
public class UserAction {

	private static final  Log log=LogFactory.getLog(UserAction.class);
	
	@RequestMapping("/user.do")
	public String user(){	
		log.info("user");
		return "model/user";
	}
	
	@RequestMapping(value="/list.do", method = RequestMethod.GET)
	@ResponseBody
	public Object list(@RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
			@RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
			@RequestParam(required = false, defaultValue = "", value = "search") String search,
			@RequestParam(required = false, value = "sort") String sort,
			@RequestParam(required = false, value = "order") String order){	
		log.info("list");
		List<UpmsSystem> rows = new ArrayList<UpmsSystem>();
			int n=10;
			for(int i=0; i<n; i++){
				UpmsSystem us = new UpmsSystem();
				us.setBanner("CEO");
				us.setBasepath("是否");
				us.setSystemId(10);
				us.setName("付费");
				us.setIcon("688");
				us.setTitle("你发Joe");
				rows.add(us);
			}


		long total = 53;
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("rows", rows);
		result.put("total", total);
		return result;
	}
}
