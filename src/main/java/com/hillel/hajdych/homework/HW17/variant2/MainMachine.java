package com.hillel.hajdych.homework.HW17.variant2;

import java.util.Arrays;
import java.util.Scanner;

public class MainMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DrinksMachine drinksMachine[] = DrinksMachine.values();
        DrinksMachine userChoice = null;

        while (true) {
            boolean exit = false;
            while (true) {
                System.out.println("Виберіть напій зі списку: " + Arrays.toString(drinksMachine));
                String userValue = scanner.nextLine().toUpperCase();

                if (userValue.toUpperCase().equals("EXIT")){
                    exit = true;
                    break;
                }

                for (DrinksMachine drink : drinksMachine) {
                    if (userValue.equals(drink.toString())) {
                        userChoice = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }



                if (userChoice != null) {
                    break;
                } else {
                    System.out.println("Неправильно введена назва напою!");
                }
            }

            if (exit) break;

            drinkMaker(userChoice);
            new Drinks(userChoice);

            System.out.println();
            System.out.println("Загальна кількість приготовлених напоїв: " + Drinks.getCounter());
            System.out.println("Сума до сплати: " + Drinks.getTotal() + " грн.");
            System.out.println("Для завершення операції введіть EXIT!");

        }
    }

    static void drinkMaker(DrinksMachine drinkChoice){
        switch (drinkChoice){
            case COFFEE: {
                System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
                System.out.println("Мелення кавових зерен;");
                System.out.println("Заварювання.");
                break;
            }
            case TEA: {
                System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
                System.out.println("Пакетик чаю;");
                System.out.println("Гаряча вода;");
                System.out.println("Заварювання.");
                break;
            }
            case LEMONADE:{
                System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
                System.out.println("Охолодження мінеральна вода;");
                System.out.println("Лимонний сік;");
                System.out.println("Долька лимону;");
                System.out.println("Лід.");
                break;
            }
            case MOJITO:{
                System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
                System.out.println("Охолоджена газованка;");
                System.out.println("Долька лайму;");
                System.out.println("Мʼята;");
                System.out.println("Дрібка цукру;");
                System.out.println("Ром;");
                System.out.println("Лід.");
                break;
            }
            case MINERAL_WATER:
            case COCA_COLA: {
                System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
                System.out.println("Наповнення стаканчика.");
                break;
            }
        }
    }
}
