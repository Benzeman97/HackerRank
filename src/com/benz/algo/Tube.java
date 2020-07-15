package com.benz.algo;

import java.util.ArrayList;
import java.util.List;

interface Subject{
    void subscribe(Subscriber subr);
    void unSubscribe(Subscriber subr);
    void upload(String title);
    void notification();
}

interface Observer{
    void channelSubscribe(Channel ch);
    void channelUnSubscribe(Channel ch);
    void update(String title);

}
class Subscriber implements Observer{

      String name;
      Channel ch;

      public Subscriber(String name)
      {
          this.name=name;
      }

    @Override
    public void channelSubscribe(Channel ch) {
        this.ch=ch;
        this.ch.subscribe(this);
    }

    @Override
    public void channelUnSubscribe(Channel ch) {
       this.ch=ch;
       this.ch.unSubscribe(this);
    }

    @Override
    public void update(String title) {
        System.out.println("Hello "+name+" Video is uploaded "+title);
    }
}

class Channel implements Subject{

    String title;

    List<Subscriber> subscribers;

    public Channel()
    {
        subscribers=new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subr) {
        subscribers.add(subr);
    }

    @Override
    public void unSubscribe(Subscriber subr) {
         subscribers.remove(subr);
    }

    @Override
    public void upload(String title) {
       this.title=title;
       notification();
    }

    @Override
    public void notification() {
        subscribers.forEach(subs->subs.update(title));
    }
}

public class Tube {

    public void display()
    {
        Subscriber sub1=new Subscriber("Nafaz Benzema");
        Subscriber sub2=new Subscriber("Chopa Satha");
        Subscriber sub3=new Subscriber("Doto Kama");
        Subscriber sub4=new Subscriber("Kelly Brook");
        Subscriber sub5=new Subscriber("Julia Ann");

        Channel xxx=new Channel();
        Channel veyangallaBoys=new Channel();


        sub4.channelSubscribe(xxx);
        sub5.channelSubscribe(xxx);

       sub1.channelSubscribe(veyangallaBoys);
       sub2.channelSubscribe(veyangallaBoys);
       sub3.channelSubscribe(veyangallaBoys);

        sub1.channelUnSubscribe(veyangallaBoys);

        xxx.upload("XXX Fuck Going On");
        veyangallaBoys.upload("timepass with mafas");




    }
}
