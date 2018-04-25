package com.websocket.client;

import java.io.IOException;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ClientEndpoint
public class ExampleEndpoint {
	
	 @OnOpen
	   public void openedConnection (Session session) {
	      System.out.println("WebSocket opened: " + session.getId());
	   }
	 
	 @OnMessage
	   public void onMessage(String msg) throws IOException {
		  System.out.println("message receive from server.........."+msg);
	   }
}
