package com.velalar.staffms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staffcollection")
public class StaffCollection {
	
	@Id
	private Object _id;

	private String name;
	
	private int age;
	
	private String email;

	public Object get_id() {
		return _id;
	}

	public void set_id(Object _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StaffCollection [_id=" + _id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
}
