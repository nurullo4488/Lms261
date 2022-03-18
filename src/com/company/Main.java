package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    Car деген класс тузунуз (Id, номер авто)
//    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//    HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.

    public static  void main(String[] args) {
	HashMap <Car,Test>map= new HashMap<>();
    Car car1= new Car(1,"777 NNN");
    Car car2=new Car(2," 888  AZA");
    Car car3=new Car(3,"999 GUZI");

    Test test1= new Test(2022,"BMW",90000000,"WHITE");
    Test test2= new Test(2021,"MERSEDES-BENZ",800000,"KARA");
    Test test3= new Test(2020,"ROLS-ROYSE",9990000,"ORANGE");
    map.put(car1,test1);
    map.put(car2,test2);
    map.put(car3,test3);
        for (Map.Entry<Car,Test> carTestEntry : map.entrySet()){
            System.out.println("MASHINALAR  : "+ carTestEntry.getKey()+"data :"+carTestEntry.getValue());
        }

        }

            






}
