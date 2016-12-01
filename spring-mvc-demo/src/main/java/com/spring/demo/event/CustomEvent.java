package com.spring.demo.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	private static final long serialVersionUID = 8546424617800158454L;

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
}
