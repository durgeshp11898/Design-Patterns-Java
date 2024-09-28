package com.learn.main;

import com.learn.subscriber.MyYouTubeChannel;
import com.learn.subscriber.YouTubeSubscriber;

public class YouTubeObserverPatternExample {
	
    public static void main(String[] args) {
        // Create a YouTube channel
        MyYouTubeChannel channel = new MyYouTubeChannel("Tech Talks");

        // Create subscribers
        YouTubeSubscriber subscriber1 = new YouTubeSubscriber("John");
        YouTubeSubscriber subscriber2 = new YouTubeSubscriber("Emma");
        YouTubeSubscriber subscriber3 = new YouTubeSubscriber("Sophia");

        // Subscribers subscribe to the channel
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        // Upload a new video and notify subscribers
        channel.uploadVideo("Observer Design Pattern Tutorial");
    }
}