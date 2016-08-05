package org.lanqiao.zhengwei.demo.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Categories {
	private static Map<Long,Category> categories = new HashMap<>();
	static{
		categories.put(1L,new Category(1L,"武侠小说"));
		categories.put(2L,new Category(2L,"经典名著"));
	}
	public static Category get(Long id) {
		return categories.get(id);
	}
	public static Collection<Category> getAll() {
		// TODO Auto-generated method stub
		return categories.values();
	}
}
