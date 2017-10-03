package com.jala.sys.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jala.sys.model.UpmsSystem;
import com.jala.sys.utils.ComplexResult;
import com.jala.sys.utils.UpmsResult;
import com.jala.sys.utils.UpmsResultConstant;


@RequestMapping("/sys")  
@Controller 
public class IndexAction {

	private static final  Log log=LogFactory.getLog(IndexAction.class);
	
//	@Autowired
//	private UpmsSystemService upmsSystemService;
	
	
	@RequestMapping("/login.do")
	public String login(){	
		log.info("login");
		return "model/login";
	}
	
	@RequestMapping("/index.do")
	public String index(){	
		log.info("hello");
		return "model/index";
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
				us.setBanner("123");
				us.setBasepath("345");
				us.setSystemId(110);
				us.setName("3244");
				us.setIcon("6");
				us.setTitle("333");
				rows.add(us);
			}


		long total = 123;
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("rows", rows);
		result.put("total", total);
		return result;
	}
	
	//@ApiOperation(value = "新增系统")
	//@RequiresPermissions("upms:system:create")
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create() {
		return "/manage/system/create.jsp";
	}

	//@ApiOperation(value = "新增系统")
	//@RequiresPermissions("upms:system:create")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public Object create(UpmsSystem upmsSystem) {
//		ComplexResult result = FluentValidator.checkAll()
//				.on(upmsSystem.getTitle(), new LengthValidator(1, 20, "标题"))
//				.on(upmsSystem.getName(), new LengthValidator(1, 20, "名称"))
//				.doValidate()
//				.result(ResultCollectors.toComplex());
		ComplexResult result = null;
		if (!result.isSuccess()) {
			return new UpmsResult(UpmsResultConstant.INVALID_LENGTH, result.getErrors());
		}
		long time = System.currentTimeMillis();
		upmsSystem.setCtime(time);
		upmsSystem.setOrders(time);
//		int count = upmsSystemService.insertSelective(upmsSystem);
		int count = 0;
		return new UpmsResult(UpmsResultConstant.SUCCESS, count);
	}

	//@ApiOperation(value = "删除系统")
	//@RequiresPermissions("upms:system:delete")
	@RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
	@ResponseBody
	public Object delete(@PathVariable("ids") String ids) {
//		int count = upmsSystemService.deleteByPrimaryKeys(ids);
		int count = 0;
		return new UpmsResult(UpmsResultConstant.SUCCESS, count);
	}

	//@ApiOperation(value = "修改系统")
	//@RequiresPermissions("upms:system:update")
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") int id, ModelMap modelMap) {
		//UpmsSystem system = upmsSystemService.selectByPrimaryKey(id);
		UpmsSystem system = null;
		modelMap.put("system", system);
		return "/manage/system/update.jsp";
	}

	//@ApiOperation(value = "修改系统")
	//@RequiresPermissions("upms:system:update")
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	@ResponseBody
	public Object update(@PathVariable("id") int id, UpmsSystem upmsSystem) {
//		ComplexResult result = FluentValidator.checkAll()
//				.on(upmsSystem.getTitle(), new LengthValidator(1, 20, "标题"))
//				.on(upmsSystem.getName(), new LengthValidator(1, 20, "名称"))
//				.doValidate()
//				.result(ResultCollectors.toComplex());
		ComplexResult result = null;
		if (!result.isSuccess()) {
			return new UpmsResult(UpmsResultConstant.INVALID_LENGTH, result.getErrors());
		}
		upmsSystem.setSystemId(id);
		//int count = upmsSystemService.updateByPrimaryKeySelective(upmsSystem);
		int count = 0;
		return new UpmsResult(UpmsResultConstant.SUCCESS, count);
	}
	
}
