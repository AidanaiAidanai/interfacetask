package com.company;

public class Main {

    public static void main(String[] args) {
	Swimable swimable = new Shark();
    Swimable swimable1 = new Durk();
    Swimable swimable2 = new Turtle();
    Swimable[]ocean = {swimable, swimable1, swimable2};
        for (Swimable animals: ocean) {
            animals.swim();

        }
    }
}
