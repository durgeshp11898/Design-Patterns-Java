package com.learn.observer;

public interface YouTubeChannel {

	void subscribe(Subscriber subscriber);
	void unsubscribe(Subscriber subscriber);
	void notifySubscribers();

}
