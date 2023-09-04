package com.instagram1.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram1.profile.model.Message;
import com.instagram1.profile.service.MessagesService;

@RestController
public class MessagesController {
	
	@Autowired
	MessagesService messagesService;
	
	@GetMapping(value="/messages")
	public List<Message> getMessages() {
		System.out.println("Got into messages API");
		List<Message> messages = messagesService.getMessagesList("zuck", "elon");
		return messages;
	}
}
