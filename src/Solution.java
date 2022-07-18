import java.util.ArrayList;




public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.sound();
        Cat[] cats = new Cat[6];
        String[] names = {"Kitty", "Murka", "Durka", "Vasya", "Keshka", "Tisha"};
        for(int i = 0; i < cats.length; i++){
            cats[i] = new Cat(names[i]);
        }
        for(int i = 0; i < cats.length; i++){
            System.out.println(cats[i].name);
        }
        Dog dog1 = new Dog("Zhuchka"); // создание экземпляра класса по сильной ссылке
        Dog dog2 = new Dog ("Strelka");
        Dog[] dogs = new Dog[2];
        Animals a = (Animals) dog1;
        new Animals().sound(); // создание экземпляра класса по слабой ссылке
        dogs[0] = dog1;
        dogs[1] = dog2;
        for(Dog d : dogs){
            System.out.println(d.name);
            d.sound();
        }
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        for(Dog d : dogs) {
            dogList.add(d);
        }
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(cats[0]);
        for (Cat c : cats) {
            catList.add(c);
        }

    }

    }
    class Animals {
        void sound(){
            System.out.println("Default sound");
        }
        void walk(){
            System.out.println("Four legs top top");
        }
    }
    class Cat extends Animals {
        String name = "Default";
        public Cat(String n){
           this.name = n;
        }

        @Override
        void sound() {
            System.out.println("Mew mew");
        }

        public Cat() {

        }
    }
    class Dog extends Animals {
        String name = "Default";
        public Dog(String n) {
            this.name = n;
        }
        public Dog() {

        }

        @Override
        void sound() {
            System.out.println("bow wow");
        }
    }