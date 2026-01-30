package ru.netology.service;

public class CustomsService {

    static final int CUSTOM_DUTY = 100;

    public static int calculateCustoms(int price, int weight){
        return (price / 100 + weight * CUSTOM_DUTY);
    }
}
