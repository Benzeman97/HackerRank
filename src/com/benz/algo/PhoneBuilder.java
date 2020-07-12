package com.benz.algo;

public class PhoneBuilder {

    private int ram;
    private double display;
    private String os;
    private int camera;
    private String processor;

    public PhoneBuilder setRam(int ram)
    {
        this.ram=ram;
        return this;
    }
    public PhoneBuilder setDisplay(double display)
    {
        this.display=display;
        return this;
    }
    public PhoneBuilder setOs(String os)
    {
        this.os=os;
        return this;
    }
    public PhoneBuilder setCamera(int camera)
    {
        this.camera=camera;
        return this;
    }

    public PhoneBuilder setProcessor(String processor)
    {
        this.processor=processor;
        return this;
    }

    public Phone builder()
    {
        return new Phone(os,processor,ram,camera,display);
    }


}
