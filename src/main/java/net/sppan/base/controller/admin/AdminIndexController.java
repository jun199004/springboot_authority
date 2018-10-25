package net.sppan.base.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sppan.base.controller.BaseController;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminIndexController extends BaseController{
	@RequestMapping(value ={"/admin/","/admin/index"})
	public String index(){

		return "admin/index";
	}

	@RequestMapping(value = {"/admin/welcome"})
	public String welcome(Map<String, Object> map){
		map.put("name", "Joe");
		map.put("sex", 1);    //sex:性别，1：男；0：女；

		// 模拟数据
		List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
		Map<String, Object> friend = new HashMap<String, Object>();
		friend.put("name", "xbq");
		friend.put("age", 22);
		friends.add(friend);
		friend = new HashMap<String, Object>();
		friend.put("name", "July");
		friend.put("age", 18);
		friends.add(friend);
		map.put("friends", friends);
		return "admin/welcome";
	}
	@RequestMapping(value = {"/test"})
	public  String test(Map<String,Object> map){
		map.put("name", "testname");
		map.put("sex", 1);    //sex:性别，1：男；0：女；

		// 模拟数据
		List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
		Map<String, Object> friend = new HashMap<String, Object>();
		friend.put("name", "xbq");
		friend.put("age", 22);
		friends.add(friend);
		friend = new HashMap<String, Object>();
		friend.put("name", "July");
		friend.put("age", 18);
		friends.add(friend);
		map.put("friends", friends);
		return "test";
	}
}
