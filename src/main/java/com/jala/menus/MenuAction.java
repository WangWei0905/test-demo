package com.jala.menus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@RequestMapping("/menus")  
@Controller 
public class MenuAction {

	private static final  Log log=LogFactory.getLog(MenuAction.class);

	
	@RequestMapping("/menus.do")
	public String menus(HttpServletRequest request){
		//System.out.println(request.getParameter("id") + "  " + request.getParameter("name") + "   " + request.getParameter("otherParam"));
		//log.info("menus");
		return "menus/menus";
	}
	
	
	@RequestMapping("/ajax.do")
	@ResponseBody
	public Object ajax(HttpServletRequest request){
		//log.info(request.getParameter("id") + "  " + request.getParameter("name") + "   " + request.getParameter("otherParam"));
		//log.info("menus");
		
        ZtreeBean zb = new ZtreeBean();  
        zb.setId(1);
        zb.setpId(22);
        zb.setName("123");
        ZtreeBean zb1 = new ZtreeBean();  
        zb1.setId(2);
        zb1.setName("456");
        zb1.setpId(1);
        ZtreeBean zb2 = new ZtreeBean();  
        zb2.setId(3);
        zb2.setName("789");
        zb2.setpId(22);
        ZtreeBean zb3 = new ZtreeBean(); 
        zb3.setId(4);
        zb3.setName("101112");
        zb3.setpId(22);
        List<ZtreeBean> list = new ArrayList<ZtreeBean>();  
        list.add(zb);  
        list.add(zb1);  
        list.add(zb2);  
        list.add(zb3);  
        String str = JSON.toJSONString(list);  
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("list", list);
		return str;
	}
	
	@RequestMapping("/async.do")
	@ResponseBody
	public Object async(HttpServletRequest request){
		log.info(request.getParameter("id") + "  " + request.getParameter("name") + "   " + request.getParameter("otherParam"));
		log.info("async");
		
        ZtreeBean zb = new ZtreeBean();  
        zb.setId(11);
        zb.setpId(122);
        zb.setName("1123");
        ZtreeBean zb1 = new ZtreeBean();  
        zb1.setId(12);
        zb1.setName("1456");
        zb1.setpId(122);
        ZtreeBean zb2 = new ZtreeBean();  
        zb2.setId(13);
        zb2.setName("1789");
        zb2.setpId(122);
        ZtreeBean zb3 = new ZtreeBean(); 
        zb3.setId(14);
        zb3.setName("1101112");
        zb3.setpId(122);
        List<ZtreeBean> list = new ArrayList<ZtreeBean>();  
        list.add(zb);  
        list.add(zb1);  
        list.add(zb2);  
        list.add(zb3);  
        String str = JSON.toJSONString(list);  
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("list", list);
		return str;
	}
	
	
}
