package org.lanqiao.zhengwei.demo.rest;

import java.io.Serializable;

public class Category implements Serializable {

    private Long id;

    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
