package com.hillel.hajdych.homework.HW17.drinkMachine;

public class Drinks {

    private static int counter = 0;
    private static double total = 0;

    public Drinks(DrinksMachine drinkChoice) {
        counter++;
        drinkMaker(drinkChoice);
    }

    private static final double coffeePrice = 30.75;
    private static final double teaPrice = 15;
    private static final double lemonadePrice = 26.25;
    private static final double mojitoPrice = 20.5;
    private static final double mineralWaterPrice = 10;
    private static final double cocaColaPrice = 17.25;


    public static int getCounter() {
        return counter;
    }

    public static double getTotal() {
        return total;
    }

    public static double getCoffeePrice() {
        return coffeePrice;
    }

    public static double getTeaPrice() {
        return teaPrice;
    }

    public static double getLemonadePrice() {
        return lemonadePrice;
    }

    public static double getMojitoPrice() {
        return mojitoPrice;
    }

    public static double getMineralWaterPrice() {
        return mineralWaterPrice;
    }

    public static double getCocaColaPrice() {
        return cocaColaPrice;
    }

    public void drinkMaker(DrinksMachine drinkChoice){
        switch (drinkChoice){
            case COFFEE: {
                recipeCoffee(drinkChoice);
                total += coffeePrice;
                break;
            }
            case TEA: {
                recipeTea(drinkChoice);
                total += teaPrice;
                break;
            }
            case LEMONADE:{
                recipeLemonade(drinkChoice);
                total += lemonadePrice;
                break;
            }
            case MOJITO:{
                recipeMojito(drinkChoice);
                total += mojitoPrice;
                break;
            }
            case MINERAL_WATER:{
                recipeMineralWaterCocaCola(drinkChoice);
                total += mineralWaterPrice;
                break;
            }
            case COCA_COLA: {
                recipeMineralWaterCocaCola(drinkChoice);
                total += cocaColaPrice;
                break;
            }
        }
    }

    static void pricesOfDrinks(){
        System.out.println("АВТОМАТ З НАПОЯМИ");
        System.out.println();
        System.out.println(DrinksMachine.COFFEE.getType() + " --> " + coffeePrice + "грн.");
        System.out.println(DrinksMachine.TEA.getType() + " --> " + teaPrice + "грн.");
        System.out.println(DrinksMachine.LEMONADE.getType() + " --> " + lemonadePrice + "грн.");
        System.out.println(DrinksMachine.MOJITO.getType() + " --> " + mojitoPrice + "грн.");
        System.out.println(DrinksMachine.MINERAL_WATER.getType() + " --> " + mineralWaterPrice + "грн.");
        System.out.println(DrinksMachine.COCA_COLA.getType() + " --> " + cocaColaPrice + "грн.");
        System.out.println();
    }

    void recipeCoffee(DrinksMachine drinkChoice){
        System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
        System.out.println("Мелення кавових зерен;");
        System.out.println("Заварювання.");
    }

    void  recipeTea(DrinksMachine drinkChoice){
        System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
        System.out.println("Пакетик чаю;");
        System.out.println("Гаряча вода;");
        System.out.println("Заварювання.");
    }
    void  recipeLemonade(DrinksMachine drinkChoice){
        System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
        System.out.println("Охолодження мінеральна вода;");
        System.out.println("Лимонний сік;");
        System.out.println("Долька лимону;");
        System.out.println("Лід.");
    }

    void  recipeMojito(DrinksMachine drinkChoice){
        System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
        System.out.println("Охолоджена газованка;");
        System.out.println("Долька лайму;");
        System.out.println("Мʼята;");
        System.out.println("Дрібка цукру;");
        System.out.println("Ром;");
        System.out.println("Лід.");
    }

    void  recipeMineralWaterCocaCola(DrinksMachine drinkChoice){
        System.out.println("Ваш напій: " + drinkChoice.getType() + "\n" + "Приготування: ");
        System.out.println("Наповнення стаканчика.");
    }
}
