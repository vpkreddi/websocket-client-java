package com.websocket.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	
	@Bean
	public Session getWebsocketClientSession() throws DeploymentException, IOException, URISyntaxException {
		String URL = "ws://localhost:3000";
		WebSocketContainer container = ContainerProvider.getWebSocketContainer();
     	Session	session = container.connectToServer(ExampleEndpoint.class,  new URI(URL));
		return session;
	}
	
    public static void main(String[] args) throws DeploymentException, IOException, URISyntaxException {
			    	SpringApplication.run(DemoApplication.class, args);
			    	
			     }
	}

