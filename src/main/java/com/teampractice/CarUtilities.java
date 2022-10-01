package com.teampractice;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

public class CarUtilities {
    private static Stream<Car> getCarsOfBrandStream(Car[] cars, String brand) {
        return Arrays.stream(cars).filter((car) -> car.getBrand().equals(brand));
    }

    private static Car[] carSteamToArray(Stream<Car> stream) {
        return stream.toArray(Car[]::new);
    }

    private static int getYearsBetweenTwoDates(Date start, Date end) {
        var calDate1 = Calendar.getInstance();
        calDate1.setTime(start);
        var calDate2 = Calendar.getInstance();
        calDate2.setTime(end);
        int difference = calDate2.get(Calendar.YEAR) - calDate1.get(Calendar.YEAR);
        return calDate1.get(Calendar.DAY_OF_YEAR) > calDate2.get(Calendar.DAY_OF_YEAR) ? difference-1 : difference;
    }

    public static Car[] getCarsOfBrand(Car[] cars, String brand) {
        return carSteamToArray(getCarsOfBrandStream(cars, brand));
    }

    public static Car[] getCarsOfBrandOlderThanNYears(Car[] cars, String brand, int years) {
        Stream<Car> carStream = getCarsOfBrandStream(cars, brand)
                .filter((car) -> getYearsBetweenTwoDates(car.getYear(), new Date()) > years);
        return carSteamToArray(carStream);
    }

    public static Car[] getCarsOfYearWithPriceHigherThanN(Car[] cars, Date year, int price) {
        Stream<Car> carStream = Arrays.stream(cars)
                .filter((car) -> getYearsBetweenTwoDates(car.getYear(), year) == 0)
                .filter((car) -> car.getPrice() > price);
        return carSteamToArray(carStream);
    }
}
