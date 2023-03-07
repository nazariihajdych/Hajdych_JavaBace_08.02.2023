package com.hillel.hajdych.homework.HW14.FitnessTrekker;

public class FitnessTrekker {

    private final String name, email, phoneNumber ;
    private final int birthdayDay, birthdayMonth, birthdayYear;
    private final int yearsOld;
    private String surname, bloodPressure;
    private int weight, stepByDay ;

    public FitnessTrekker(String name, String email, String phoneNumber, int birthdayDay, int birthdayMounth,
                          int birthdayYear, String surname, String bloodPressure, int weight, int stepByDay) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMounth;
        this.birthdayYear = birthdayYear;
        this.surname = surname;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.stepByDay = stepByDay;

        int year = 2023;
        this.yearsOld = year - this.birthdayYear;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStepByDay() {
        return stepByDay;
    }

    public void setStepByDay(int stepByDay) {
        this.stepByDay = stepByDay;
    }

    public void printAccountInfo() {
        System.out.print("Прізвище/Імʼя: " + this.surname + " " + this.name);
        System.out.println("  |  Дата народження: " + this.birthdayDay + "." + this.birthdayMonth + "." + this.birthdayYear);
        System.out.println("Контактна інформація -> Емайл: " + this.email + "  |  Номер телефону: " + this.phoneNumber);
        System.out.println("Показники -> Вік: " + this.yearsOld + "  |  Вага: " + this.weight + "  |  Тиск: " + this.bloodPressure +
                "  |  Пройдені кроки в день: " + this.stepByDay);
    }

}
