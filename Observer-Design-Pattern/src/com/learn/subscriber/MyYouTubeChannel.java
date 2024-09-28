package com.learn.subscriber;

import java.util.ArrayList;
import java.util.List;

import com.learn.observer.Subscriber;
import com.learn.observer.YouTubeChannel;

public class MyYouTubeChannel implements YouTubeChannel {

	private List<Subscriber> subscribers = new ArrayList<>();
	private String channelName;
	private String latestVideo;

	public MyYouTubeChannel(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
		System.out.println(subscriber + " has subscribed to " + channelName);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
		System.out.println(subscriber + " has unsubscribed from " + channelName);
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(latestVideo);
		}
	}

	// Upload new video
	public void uploadVideo(String videoTitle) {
		this.latestVideo = videoTitle;
		System.out.println("New video uploaded: " + videoTitle);
		notifySubscribers();
	}
}