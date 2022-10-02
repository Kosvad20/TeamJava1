package com.teampractice;

import java.util.Arrays;
import java.util.Calendar;
import java.util.stream.Stream;

public class CarUtilities {
    private static Stream<Car> getCarsOfBrandStream(Car[] cars, String brand) {
        return Arrays.stream(cars).filter((car) -> car.getBrand().equals(brand));
    }

    private static Car[] carSteamToArray(Stream<Car> stream) {
        return stream.toArray(Car[]::new);
    }

    private static int getYearsToCurrentYear(int year) {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public static Car[] getCarsOfBrand(Car[] cars, String brand) {
        return carSteamToArray(getCarsOfBrandStream(cars, brand));
    }

    public static Car[] getCarsOfBrandOlderThanNYears(Car[] cars, String brand, int years) {
        Stream<Car> carStream = getCarsOfBrandStream(cars, brand)
                .filter((car) -> getYearsToCurrentYear(car.getYear()) > years);
        return carSteamToArray(carStream);
    }

    public static Car[] getCarsOfYearWithPriceHigherThanN(Car[] cars, int year, int price) {
        Stream<Car> carStream = Arrays.stream(cars)
                .filter((car) -> car.getYear() == year)
                .filter((car) -> car.getPrice() > price);
        return carSteamToArray(carStream);
    }
}
