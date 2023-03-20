package com.hillel.hajdych.homework.HW14.FitnessTrekker;

public class MainTrekker {
    public static void main(String[] args) {
        FitnessTrekker user1 = new FitnessTrekker("Назарій", "nazar.hajdych@gmail.com"
                , "068-077-57-89", 1, 7, 1998
                , "Гайдич", "120/60", 73, 2035);
        FitnessTrekker user2 = new FitnessTrekker("Борис", "boris.hrozan@gmail.com"
                , "098-276-05-04", 5, 10, 1988
                , "Грозан", "130/70", 84, 3490);
        FitnessTrekker user3 = new FitnessTrekker("Орист", "oryst.pipchyk@gmail.com"
                , "097-345-34-67", 7, 11, 2001
                , "Піпчик", "140/70", 69, 4678);

        System.out.println("До внесення змін:");
        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();

        user2.setWeight(90);
        user2.setStepByDay(user1.getStepByDay());
        user2.setSurname("Полонник");

        user3.setWeight(user2.getWeight());
        user3.setBloodPressure("110/60");
        user3.setStepByDay(3434);


        System.out.println();
        System.out.println("Після внесення змін:");
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();

    }

    //Медод виводу інформації з використанням Getter
//    public static void printAccountInfo(FitnessTrekker user){
//        System.out.print("Прізвище/Імʼя: " + user.getSurname() + " " + user.getName());
//        System.out.println("  |  Дата народження: " + user.getBirthdayDay() + "." + user.getBirthdayMonth()
//                + "." + user.getBirthdayYear());
//        System.out.println("Контактна інформація -> Емайл: " + user.getEmail()
//                + "  |  Номер телефону: " + user.getPhoneNumber());
//        System.out.println("Показники -> Вік: " + user.getYearsOld() + "  |  Вага: " + user.getWeight()
//                + "  |  Тиск: " + user.getBloodPressure() + "  |  Пройдені кроки в день: " + user.getStepByDay());
//    }

}
