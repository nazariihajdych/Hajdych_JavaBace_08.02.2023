package com.hillel.hajdych.lessons.LS2;

public class VariablesTypes {
    public static void main(String[] args) {
        byte age;

        age = 25;
        byte age2 = 27;

        short length = 32000;
        int someIn = 203948403;
        long someLg = 2342343243434443l;

        float someFl = 10.1234f;
        double someDb = 10.3365765;

        System.out.println(someFl);
        System.out.println(someDb);

        char somCh = 'Ї';
        char somCh2 = 65;
        char somCh3 = '\u0041';

        System.out.println();
        System.out.println(somCh);
        System.out.println(somCh2);
        System.out.println(somCh3);

        boolean isBol = true;

        char w = 'D';
        int y = w;
        System.out.println(y);

        int wheels = 4;
        byte byteWheels = (byte) wheels;

        System.out.println(byteWheels);

        String str = "Hello word";
        String str2 = " ,Java Best";


        System.out.println(str + str2);
        System.out.println(str + 20 + 10);
        System.out.println(20 + 10 + str);
        System.out.println(str + (20+10));


    }
}
