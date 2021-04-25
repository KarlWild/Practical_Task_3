package com.company;

import com.company.task_1.SqlQuery;
import com.company.task_1.SqlQueryImpl;
import com.company.task_2.Person;
import com.company.task_3.Address;
import com.company.task_4.Shirt;
import com.company.task_5.PhoneNumber;

public class Main {
    /**
     * "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d]
     * * Квартира" ([d] – разделитель, например, «запятая»)
     * ,.;- (класс StringTokenizer).
     */
    public static void main(String[] args) {
        // write your code here
        SqlQuery sqlQuery = new SqlQueryImpl("group 1", 5);
        System.out.println(sqlQuery.toString());

        Person person1 = new Person("Ilya", "Stepanov", "Sergeevich");
        Person person2 = new Person("Ilya", "Stepanov");
        Person person3 = new Person("Stepanov");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        Address address1 = new Address("Russia, oskovskaya, Kashira, Pushkina, 35, 2");
        Address address2 = new Address("USA; Brooklyn. New York. Green. 35. 2");
        Address address3 = new Address("Россия-Калужская область-Калуга-улица Печкина-45-5");
        Address address4 = new Address("Россия, Московская область. Озёры; Тверская- 67, 7");
        address1.outputSplit();
        address2.outputTokenizer();
        address3.outputTokenizer();
        address4.outputTokenizer();

        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1 = new Shirt[shirts.length];
        int i = 0;
        for (String s : shirts) {
            shirts1[i++] = new Shirt(s);
        }
        for (Shirt s : shirts1) System.out.println(s.toString());

        PhoneNumber phoneNumber = new PhoneNumber("89150498721");
        System.out.println(phoneNumber.getPhone());
    }
}
