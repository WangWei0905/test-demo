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


@RequestMapping("/MenusTo")  
@Controller 
public class MenusToAction {

	private static final  Log log=LogFactory.getLog(MenusToAction.class);

	
	@RequestMapping("/MenusTo.do")
	public String menus(HttpServletRequest request){
		//System.out.println(request.getParameter("id") + "  " + request.getParameter("name") + "   " + request.getParameter("otherParam"));
		//log.info("menus");
		return "menus/test";
	}
	
	
	@RequestMapping("/ajax.do")
	@ResponseBody
	public Object ajax(HttpServletRequest request){
		log.info(request.getParameter("id") + "  " + request.getParameter("name") + "   " + request.getParameter("otherParam"));
		//log.info("menus");
		
        Ztree zb = new Ztree();  
        zb.setId("1011a");
        zb.setpId("101");
        zb.setName("目录1.1");
        zb.setIsParent("false");
        zb.setFile("clickme");
        Ztree zb1 = new Ztree();  
        zb.setId("1012a");
        zb.setpId("101");
        zb.setName("目录1.2");
        zb.setIsParent("false");
        zb.setFile("clickme");
        Ztree zb2 = new Ztree();  
        zb.setId("1021a");
        zb.setpId("102");
        zb.setName("目录1.3");
        zb.setIsParent("false");
        zb.setFile("clickme");
        Ztree zb3 = new Ztree();  
        zb.setId("1031a");
        zb.setpId("102");
        zb.setName("目录1.4");
        zb.setIsParent("false");
        zb.setFile("clickme");
        
        List<Ztree> list = new ArrayList<Ztree>();  
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
