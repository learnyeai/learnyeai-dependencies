package com.learnyeai.demo.saasclient.resource;

import org.springframework.hateoas.ResourceSupport;

import cn.jovanyframework.cloud.saasclient.resource.ScenePrincipal;

public class NoteResource extends ResourceSupport {

	public String id;
	public String content;
	public ScenePrincipal scene;

}
