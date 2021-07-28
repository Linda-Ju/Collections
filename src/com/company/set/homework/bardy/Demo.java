package com.company.set.homework.bardy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Bardy> lotteryBardies = new ArrayList<>();
        lotteryBardies.add(new Bardy(4, "white", 2, false));
        lotteryBardies.add(new Bardy(4, "green", 4, false));
        lotteryBardies.add(new Bardy(4, "black", 4, true));
        lotteryBardies.add(new Bardy(4, "red", 2, false));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 30, false, true));
        personList.add(new Person("Alice", 24, false, false));
        personList.add(new Person("Bill", 51, true, true));
        personList.add(new Person("Diana", 29, true, false));
        personList.add(new Person("Freddie", 46, true, false));

        for (Person person : personList) {
            List<Bardy> bardiesOwned = new ArrayList<>();

            if (person.isLikesBardy() && person.isHasBardy()) {
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setBardiesOwned(bardiesOwned);
            } else if (person.isLikesBardy() && !person.isHasBardy()) {
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setHasBardy(true);
                person.setBardiesOwned(bardiesOwned);

            }
        }
        for (Person person : personList) {

            if (person.isLikesBardy() && person.isHasBardy()) {
                System.out.println(person.getName() + " has this " + person.getBardiesOwned().get(0).getColour() + " bardy");
            }
        }
    }

    public static int getRandomIndex(List<Bardy> objectList) {
        return (int) (Math.random() * objectList.size());
    }
}
