package com.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.model.User;

@Component("customListener")
public class CustomListener implements ApplicationListener<ApplicationEvent> {

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if ( event instanceof CustomEvent ) {
			User source = (User) event.getSource();
			System.out.println(source.toString());
		}
	}
}
