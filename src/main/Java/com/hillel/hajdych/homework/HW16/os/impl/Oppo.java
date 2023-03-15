package com.hillel.hajdych.homework.HW16.os.impl;

import com.hillel.hajdych.homework.HW16.Smartphones;
import com.hillel.hajdych.homework.HW16.os.LinuxOS;

public class Oppo implements Smartphones, LinuxOS {

    private String model;
    private String linuxVersion;
    private final String name = "Oppo ";
    public Oppo(String model, String linuxVersion) {
        this.model = model;
        this.linuxVersion = linuxVersion;
    }

    @Override
    public void call() {
        System.out.println(this.name + this.model + " дзвонить!");
    }

    @Override
    public void sms() {
        System.out.println("СМС від " + this.name + this.model);
    }


    @Override
    public void linuxVersion() {
        System.out.println(this.name + this.model + " з версією ОС: " + this.linuxVersion);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLinuxVersion() {
        return linuxVersion;
    }

    public void setLinuxVersion(String linuxVersion) {
        this.linuxVersion = linuxVersion;
    }
}
