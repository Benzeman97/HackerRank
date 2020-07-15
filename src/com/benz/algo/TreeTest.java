package com.benz.algo;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}
public class TreeTest {

    public void display() {
        Component hd = new Leaf("Hard Disk", 12500.00, "China");
        Component cpu=new Leaf("CPU",90000.00,"USA");
        Component ram=new Leaf("RAM",16000.00,"Singapore");
        Component k_board=new Leaf("Key Board",4500.00,"China");
        Component mouse=new Leaf("Mouse",3200.00,"India");

        Composite motherBoard=new Composite("MotherBoard");
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);


        Composite internalDevice =new Composite("Internal Device");
        internalDevice.addComponent(hd);
        internalDevice.addComponent(motherBoard);

        Composite externalDevice=new Composite("External Device");
        externalDevice.addComponent(k_board);
        externalDevice.addComponent(mouse);

        Composite computer=new Composite("Computer");
        computer.addComponent(internalDevice);
        computer.addComponent(externalDevice);
        computer.showPrice();
    }

}

class Leaf implements Component{

    private String name;
    private double price;
    private String madeIn;

    public Leaf(String name,double price,String madeIn)
    {
        this.name=name;
        this.price=price;
        this.madeIn=madeIn;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" : "+price+" made in "+madeIn);
    }

}
class Composite implements Component{

    private String name;

    public Composite(String name)
    {
        this.name=name;
    }

    List<Component> components=new ArrayList<>();

    public void addComponent(Component com)
    {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        components.forEach(Component::showPrice);
    }

}

