package org.lanqiao.zhengwei.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//便捷的注解，@Controller 同时所有方法标注为 @ResponseBody. ，默认所有方法返回json数据格式
@RequestMapping("/book")
public class BookController {
	@RequestMapping(value="/list/{cid}",method=RequestMethod.GET)
	public List<Book> listByCategory(@PathVariable Long cid){
		return Books.listByCategory(cid);
	}
}
