package com.learnyeai.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnyeai.demo.saas.client.openfeign.client.NoteClient;

@RestController
public class HelloController {
	
	@Autowired
	NoteClient noteClient;

	@GetMapping("/sayHello")
	public ResponseEntity<?> sayHello() {
		return ResponseEntity.ok().body(noteClient.findAll());
	}

}
