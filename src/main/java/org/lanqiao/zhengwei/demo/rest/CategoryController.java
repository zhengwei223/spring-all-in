package org.lanqiao.zhengwei.demo.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//便捷的注解，@Controller 同时所有方法标注为 @ResponseBody. ，默认所有方法返回json数据格式
@RequestMapping("/cate")
public class CategoryController {
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public Collection<Category> list(){
		return Categories.getAll();
	}
}
