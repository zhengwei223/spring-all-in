package org.lanqiao.zhengwei.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 获取查询参数
 * @author zhengwei lastmodified 2016年6月20日
 *
 */
@Controller
@RequestMapping("/greeting")
public class GreetingController {

	@RequestMapping(method = RequestMethod.GET)
	public String greeting(String user /* 将请求参数中的user绑定到参数user */, Map<String, Object> model) {
		model.put("msg", "hello " + user);
		return "hello_view";
	}

	@RequestMapping(value = { "/more" }, method = RequestMethod.GET)
	public String greeting(String user , int age, Map<String, Object> model) {
		model.put("msg", "hello " + user + ", your age is " + age);
		return "hello_view";
	}
}
