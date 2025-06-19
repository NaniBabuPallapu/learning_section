package company.com.design_patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

interface Subscriber{
    void update(String videoTitle);
}
class User implements Subscriber{
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name+" got notified: New video uploaded : "+videoTitle);
    }
}
class YoutubeChannel{
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void uploadNewVideo(String title){
        System.out.println("YouTube Channel uploaded: " + title);
        notifySubscribers(title);
    }

    private  void notifySubscribers(String title){
        for(Subscriber subscriber : subscribers){
            subscriber.update(title);
        }
    }
}
public class ObserverPatternExample{
    public static void main(String[] args) {

        System.out.println("\n");

        YoutubeChannel channel = new YoutubeChannel();

        Subscriber user1 = new User("Alice");
        Subscriber user2 = new User("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadNewVideo("Learn AWS course in 10 minutes");

        System.out.println("\n");
    }
}
