package com.hillel.hajdych.homework.HW10.HW101;

public class Burger {

    int numberOfMeat;
    int menuChoice;

    public Burger(int menuChoice, int numberOfMeat) {
        this.numberOfMeat = numberOfMeat;
        this.menuChoice = menuChoice;
        BurgerGenerator();
    }

    void BurgerGenerator(){

        String bunTop = "  _____________________________\n /|||||||||||||||||||||||||||||\\ - Булочка";
        String bunBottom = "\n  ______________________________\n (||||||||||||||||||||||||||||||) - Булочка";
        String meat = "\n   ooooooooooooooooooooooooooo - Котлета\n   ooooooooooooooooooooooooooo";
        String cheese = "\n ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ - Сир";
        String salad = "\n§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§ - Салат";
        String souse = "\n       ~~~  ~~~~ ~~~~  ~~~ - Соус";

        if (menuChoice == 1){
            System.out.println("Ваш звичайний бургег: ");
            System.out.println(bunTop + cheese + meat + souse + salad + bunBottom);
        } else if (menuChoice == 2) {
            System.out.println("Ваш дієтичний бургер: ");
            System.out.println(bunTop + cheese + meat +  salad + bunBottom);
        } else if (menuChoice == 3) {
            if (numberOfMeat == 0){
                System.out.println("Ви вибрали 0 котлет. Ваш вегетаріанський бургер:");
                System.out.println(bunTop + cheese +  souse + salad + bunBottom);
            } else {
                System.out.println("Ваш бургер із кількістю котлет: " + numberOfMeat);
                System.out.print(bunTop + cheese);
                for (int i = 0; i < numberOfMeat; i++) {
                    System.out.print(meat);
                    System.out.print(souse);
                }
                System.out.println(salad + bunBottom);
            }
        }
    }
}
