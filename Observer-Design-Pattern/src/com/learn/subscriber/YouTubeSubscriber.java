package com.learn.subscriber;

import com.learn.observer.Subscriber;

public class YouTubeSubscriber implements Subscriber {
	
	private String name;

	public YouTubeSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String videoTitle) {
		System.out.println(name + " has been notified about a new video: " + videoTitle);
	}
}