package org.lanqiao.zhengwei.demo.databinding;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	/** 跳转至表单 **/
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String create() {

		return "db/user/create";
	}

	/** 新增 **/
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User create(User user) {

		return user;
	}

	/** 跳转至表单 **/
	@RequestMapping(value = { "/new2" }, method = RequestMethod.GET)
	public String create2() {

		return "db/user/create2";
	}

	/** 新增 **/
	@RequestMapping(value = { "/new2" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User create2(User user) {

		return user;
	}

	@RequestMapping(value = { "/new3" }, method = RequestMethod.GET)
	public String create3() {
		return "db/user/create3";
	}

	@RequestMapping(value = { "/new3" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<User> create3(UserListForm userForm) {
		return userForm.getUsers();
	}

	@RequestMapping(value = { "/new4" }, method = RequestMethod.GET)
	public String create4() {
		return "db/user/create4";
	}

	@RequestMapping(value = { "/new4" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Set<User> create4(UserSetForm userForm) {
		return userForm.getUsers();
	}

	@RequestMapping(value = { "/new5" }, method = RequestMethod.GET)
	public String create5() {
		return "db/user/create5";
	}

	@RequestMapping(value = { "/new5" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	/*public Map<String, User> create5(UserMapForm userForm) {
		return userForm.getUsers();
	}*/
	public Map<String, Object> create5(@RequestParam Map<String, Object> map) {
		return map;
	}
	
	@RequestMapping(value = { "/new6" }, method = RequestMethod.GET)
	public String create6() {
		return "db/user/create6";
	}

	@RequestMapping(value = { "/new6" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public MultiValueMap<String, Object> create6(@RequestParam MultiValueMap<String, Object> map) {
		return map;
	}
	
	@RequestMapping(value = { "/new7" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Model create7(Model model) {
		return model;
	}
}
