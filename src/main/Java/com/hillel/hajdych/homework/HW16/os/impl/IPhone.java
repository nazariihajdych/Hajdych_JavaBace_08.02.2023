package com.hillel.hajdych.homework.HW16.os.impl;

import com.hillel.hajdych.homework.HW16.Smartphones;
import com.hillel.hajdych.homework.HW16.os.IOS;

public class IPhone implements Smartphones, IOS {

    private String model;
    private String iosVersion;
    private final String name = "iPhone ";

    public IPhone(String model, String iosVersion) {
        this.model = model;
        this.iosVersion = iosVersion;
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
    public void internet() {
        System.out.println("Звʼязок з інтернетом встановлено, модель смартфона " + this.name
                + this.model + ", версія ОС: " + this.iosVersion);
    }

    @Override
    public void iosVersion() {
        System.out.println(this.name + this.model  + " з версією ОС: " + this.iosVersion);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }
}
