package com.benz.algo;

public class Phone {
    private String os;
    private String processor;
    private int ram;
    private int camera;
    private double display;

    public Phone(String os, String processor, int ram, int camera, double display) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.camera = camera;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", camera=" + camera +
                ", display=" + display +
                '}';
    }
}
