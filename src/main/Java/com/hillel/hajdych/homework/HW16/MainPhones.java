package com.hillel.hajdych.homework.HW16;

import com.hillel.hajdych.homework.HW16.os.impl.Samsung;
import com.hillel.hajdych.homework.HW16.os.impl.IPhone;
import com.hillel.hajdych.homework.HW16.os.impl.Oppo;

public class MainPhones {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("13", "16.5");
        Samsung samsung = new Samsung("Note 7", "Kit Kat");
        Oppo oppo = new Oppo("Reno 7", "Samsung 10");

        iPhone.iosVersion();
        System.out.println();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        System.out.println();
        samsung.linuxVersion();
        System.out.println();
        samsung.call();
        samsung.sms();
        samsung.internet();
        System.out.println();
        oppo.linuxVersion();
        System.out.println();
        oppo.call();
        oppo.sms();
        oppo.internet();

    }
}
