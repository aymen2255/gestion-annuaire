package fr.treeptik.pojo;

import java.io.Serializable;

public class Type implements Serializable{
	private int id;
	private String type;

	public Type() {
		super();
	}

	public Type(String type) {
		super();
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
