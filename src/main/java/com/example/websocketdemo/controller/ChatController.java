package com.example.websocketdemo.controller;

import com.example.websocketdemo.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	
	//general
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //science
    @MessageMapping("/chat.sendMessage2")
    @SendTo("/topic/public2")
    public ChatMessage sendMessage2(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //agriculture
    @MessageMapping("/chat.sendMessage3")
    @SendTo("/topic/public3")
    public ChatMessage sendMessage3(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //business
    @MessageMapping("/chat.sendMessage4")
    @SendTo("/topic/public4")
    public ChatMessage sendMessage4(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //education
    @MessageMapping("/chat.sendMessage5")
    @SendTo("/topic/public5")
    public ChatMessage sendMessage5(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //engineering
    @MessageMapping("/chat.sendMessage6")
    @SendTo("/topic/public6")
    public ChatMessage sendMessage6(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //environmentaldesign
    @MessageMapping("/chat.sendMessage7")
    @SendTo("/topic/public7")
    public ChatMessage sendMessage7(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //hospitality
    @MessageMapping("/chat.sendMessage8")
    @SendTo("/topic/public8")
    public ChatMessage sendMessage8(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //class
    @MessageMapping("/chat.sendMessage9")
    @SendTo("/topic/public9")
    public ChatMessage sendMessage9(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    
    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //science
    @MessageMapping("/chat.addUser2")
    @SendTo("/topic/public2")
    public ChatMessage addUser2(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //ag
    @MessageMapping("/chat.addUser3")
    @SendTo("/topic/public3")
    public ChatMessage addUser3(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //business
    @MessageMapping("/chat.addUser4")
    @SendTo("/topic/public4")
    public ChatMessage addUser4(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //education
    @MessageMapping("/chat.addUser5")
    @SendTo("/topic/public5")
    public ChatMessage addUser5(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //eng
    @MessageMapping("/chat.addUser6")
    @SendTo("/topic/public6")
    public ChatMessage addUser6(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //environmentaldesign
    @MessageMapping("/chat.addUser7")
    @SendTo("/topic/public7")
    public ChatMessage addUser7(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //hospital
    @MessageMapping("/chat.addUser8")
    @SendTo("/topic/public8")
    public ChatMessage addUser8(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
    //class
    @MessageMapping("/chat.addUser9")
    @SendTo("/topic/public9")
    public ChatMessage addUser9(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}
