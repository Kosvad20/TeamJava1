package com.teampractice;

public class CarRunner {

    private static void printCarArray(Car[] carArray){
        if(carArray.length == 0){
            System.out.println("No cars under such conditions!");
        }
        else{
            for(Car car: carArray){
                System.out.println(car.toString());
            }
        }
        System.out.println("");
    }
    public static void main(String[] args){
        //Creating an array
        Car[] carArray = {
                new Car("Honda", "Civic", 2008, Color.WHITE, 7000),
                new Car("Honda", "Accord", 2012, Color.RED, 12000),
                new Car("Ford", "Mustang", 2015, Color.WHITE, 18000),
                new Car("Volkswagen", "Golf", 2008, Color.BLUE, 6000),
        };

        //Printing an array
        System.out.println("Here is full array");
        CarRunner.printCarArray(carArray);
        System.out.println("");

        //Printing task results
        System.out.println("Task 1: print all cars of brand Honda");
        CarRunner.printCarArray(CarUtilities.getCarsOfBrand(carArray, "Honda"));
        System.out.println("");

        System.out.println("Task 2.1: print all cars of brand Ford and elder than 20 years");
        CarRunner.printCarArray(CarUtilities.getCarsOfBrandOlderThanNYears(carArray, "Ford", 20));
        System.out.println("Task 2.2: print all cars of brand Ford and elder than 2 years");
        CarRunner.printCarArray(CarUtilities.getCarsOfBrandOlderThanNYears(carArray, "Ford", 2));
        System.out.println("");

        System.out.println("Task 3.1: print all cars of year 2008 and price higher than 3000");
        CarRunner.printCarArray(CarUtilities.getCarsOfYearWithPriceHigherThanN(carArray, 2008, 3000));
        System.out.println("Task 3.2: print all cars of year 2008 and price higher than 6500");
        CarRunner.printCarArray(CarUtilities.getCarsOfYearWithPriceHigherThanN(carArray, 2008, 6500));
    }
}
