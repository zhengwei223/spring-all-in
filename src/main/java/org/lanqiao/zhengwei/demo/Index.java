package org.lanqiao.zhengwei.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 声明控制器及映射
 * @author zhengwei lastmodified 2016年6月20日
 *
 */
@Controller
public class Index {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
