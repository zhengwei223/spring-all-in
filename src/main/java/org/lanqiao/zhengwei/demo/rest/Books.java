package org.lanqiao.zhengwei.demo.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Books {
	private static Map<Long,Book> books = new HashMap<>();
	static{
		books.put(1L,new Book(1L,"倚天屠龙记","",100,2011,"金庸","J001",1L));
		books.put(2L,new Book(2L,"天龙八部","",100,2011,"金庸","J002",1L));
		books.put(3L,new Book(3L,"西游记","",100,2011,"吴承恩","J003",2L));
		books.put(4L,new Book(4L,"三国演义","",100,2011,"罗贯中","J004",2L));
	}
	
	public static Book get(Long id) {
		return books.get(id);
	}
	public static List<Book> listByCategory(Long categoryId){
		List<Book> booksToReturn = new ArrayList<>();
		for (Book book : books.values()) {
			if (book.getCategory().getId().equals(categoryId)) {
				booksToReturn.add(book);
			}
		}
		return booksToReturn;
	}
}
