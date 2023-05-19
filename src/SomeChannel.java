import java.util.ArrayList;
import java.util.List;

public class SomeChannel {

    private List<Subscriber> subs = new ArrayList<>();      //list of all subscribers to each channel
    private String title;       // each channel has a name

    //accepts a subscriber object and adds it to the list
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }


    private void notifySubscribers(){
        for(Subscriber sub: subs){
            sub.update();
            // calls Subscriber instance method
        }
    }

    // public method calls private notify method and runs through whole arrayList and notifies
    public void upload (String title){
        this.title = title;
        notifySubscribers();
    }

}
