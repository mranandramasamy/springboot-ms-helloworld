package com.instagram1.profile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.instagram1.profile.model.Message;

@Service
public class MessagesService {
	public List<Message> getMessagesList(String participant1, String participant2) {
		List<Message> messages = new ArrayList<Message>();
		Message msg1 = new Message();
		msg1.setMessage("hey !!");
		msg1.setSender("elon");
		msg1.setReceiver("zuck");
		Message msg2 = new Message();
		msg2.setMessage("hi buddy");
		msg2.setSender("zuck");
		msg2.setReceiver("elon");
		messages.add(msg1);
		messages.add(msg2);
		return messages;
	}
}
