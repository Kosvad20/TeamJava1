package com.teampractice;

import java.util.Date;

public class Car{
    private int id;
    private static int counterId =1;
    private String model;
    private Date year;
    private Color color;
    private int price;
    private int registrationNumber;
    private static int counterRegNumber = 1000;

    Car(){
        this(   "no model",new Date(), Color.RED, 0);
    }
    Car(String model, Date year, Color color, int price ){
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.id = counterId++;
        this.registrationNumber =  counterRegNumber++;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public Color getColor(){
        return this.color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Date getYear(){
        return this.year;
    }
    public void setYear(Date year){
        this.year = year;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getRegistrationNumber(){
        return this.registrationNumber;
    }
    public void setRegistrationNumber(int  registrationNumber){
        this.registrationNumber = registrationNumber;
    }
}