import java.nio.channels.Channel;

public class Subscriber {
    private String name;
    private SomeChannel channel = new SomeChannel();

    // constructor requires a name but does not mandate following a channel
    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){ //this method called by SomeChannel when new video uploaded by the channel
        System.out.println(name + ", new video uploaded");
    }

    // really the channel field should be an ArrayList as well so a Subscriber can have multiple channels, but
    // that's not the point here
    public void subscribeChannel(SomeChannel ch){
        channel = ch;
    }

}
