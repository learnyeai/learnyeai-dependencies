package com.learnyeai.demo.api.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Course {

	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(length = 32)
	private String id;

	@Column(length = 80)
	private String name;

	@Lob
	@Column(columnDefinition = "TEXT")
	private String sceneToken;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSceneToken() {
		return sceneToken;
	}

	public void setSceneToken(String sceneToken) {
		this.sceneToken = sceneToken;
	}

}
