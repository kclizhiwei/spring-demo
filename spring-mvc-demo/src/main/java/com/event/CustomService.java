package com.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.model.User;

@Component("customService")
public class CustomService implements ApplicationEventPublisherAware {
	private  ApplicationEventPublisher applicationEventPublisher ;
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void test() {
		User user = new User("Tom", "tt", "pasword", "tom@123.com");
		applicationEventPublisher.publishEvent(new CustomEvent(user));
	}
}
