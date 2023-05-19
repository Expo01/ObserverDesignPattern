public class Youtube{

    public static void main(String[] args) {
        SomeChannel telusko = new SomeChannel();  // channel created

        Subscriber s1 = new Subscriber("Akshay"); // two subscribers
        Subscriber s2 = new Subscriber("Harsh");

        telusko.subscribe(s1); // adds subscribers
        telusko.subscribe(s2);

        s1.subscribeChannel(telusko); //adds channel
        s2.subscribeChannel(telusko);

        telusko.upload("How to learn stuff");
        // updates subscribers

    }

}