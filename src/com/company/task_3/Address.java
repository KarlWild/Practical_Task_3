package com.company.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Доработайте класс адреса, который из полученной строки формата
 * "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d]
 * Квартира" ([d] – разделитель, например, «запятая») выбирает
 * соответствующие части и записывает их в соответствующие поля класса
 * Address.
 * Предусмотрите две реализации этого метода:
 *  разделитель – только запятая (использовать метод split());
 *  разделитель – любой из символов ,.;- (класс StringTokenizer).
 * Необходимо помнить, что в начале и конце разобранной части адреса не
 * должно быть пробелов. Все поля адреса строковые.
 * Разработайте проверочный класс не менее чем на четыре адресных
 * строки.
 */
public class Address {
    private String address;
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    public Address(String address){
        this.address = address;
    }
    public String toString(){
        return address;
    }

    public void outputSplit(){
        addressSplit();
        System.out.println(address);
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(house);
        System.out.println(corpus);
    }

    public void outputTokenizer(){
        addressStringTokenizer();
        System.out.println(address);
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(house);
        System.out.println(corpus);
    }
    private void addressSplit(){
        String[] splitAddress = address.split(",");
        country = splitAddress[0].replaceFirst(" ","");
        region = splitAddress[1].replaceFirst(" ","");
        city = splitAddress[2].replaceFirst(" ","");
        street = splitAddress[3].replaceFirst(" ","");
        house = splitAddress[4].replaceFirst(" ","");
        corpus = splitAddress[5].replaceFirst(" ","");
    }
    private void addressStringTokenizer(){
        StringTokenizer stringTokenizer = new StringTokenizer(address, ",.;-");
        List<String> list = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            list.add(stringTokenizer.nextToken());
            if(list.get(list.size()-1).startsWith(" "))
                list.set(list.size()-1, list.get(list.size()-1).replaceFirst(" ", ""));
        }
        country = list.get(0);
        region = list.get(1);
        city = list.get(2);
        street = list.get(3);
        house = list.get(4);
        corpus = list.get(5);
    }
}
