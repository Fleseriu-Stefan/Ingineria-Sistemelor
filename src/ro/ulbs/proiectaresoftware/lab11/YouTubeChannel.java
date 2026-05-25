package ro.ulbs.proiectaresoftware.lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer>observers=new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }

    public void uploadVideo(String title) {
        String message="{"+ channelName + "} uploaded a new video: " + title;
        System.out.println(message);
        notifyObservers(message);
    }
}