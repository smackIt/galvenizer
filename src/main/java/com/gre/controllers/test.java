package com.gre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.entities.Word;
import com.gre.services.WordServices;

@RestController
public class test {
	@Autowired
	WordServices wordService;
	
	@RequestMapping(value="/helloworld")
	public Word helloWorld(Word word){
		return word;
	}
}
