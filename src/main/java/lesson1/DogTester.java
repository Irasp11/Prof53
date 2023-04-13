package lesson1;

public class DogTester {
    // static - поле или метод относятся к классу целиком
    public static void main(String[] args) {

        // конструктор по-умолчанию
        Dog trezor = new Dog();

//        trezor.age = 5;
//        trezor.name = "Trezor";
//        trezor.breed = "Buldog";
//        trezor.color = "White";

        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Buldog");
        trezor.setColor("White");
        System.out.println("Trezor breed is: " + trezor.getBreed());

        // "Bolonka" "Eleonora" 3 "White"
        Dog eleonora = new Dog("Bolonla", "Eleonora", 3, "White"); // воспользуйтесь 4-х параметрическим конструктором

        System.out.println("Eleonora's age is: " + eleonora.getAge());

        eleonora.setAge(35);
        System.out.println("Eleonora's age is: " + eleonora.getAge());

        trezor.bark();
        eleonora.bark();

        System.out.println("Number of dogs: " + Dog.numberOfDogs);

        Dog.hello();

        eleonora.hello();

        int a = 5;
        int b = 10;
        a = b;

        // final - не позволит изменить переменную
        final int d = 7;
        int e = 12;
//        d = e;

    }
}

// класс - объединение чего-либо по характерным признакам
// класс - шаблон для описания его представителей (экземляр)
// экземпляр - конкретный представитель класса
// класс - набор свойств и действий

// модификаторы доступа
// если ничего не указывать, то доступ package private - эти поля
// видны только в пакете
// public - доступ к полю или методы имеют все классы отовсюду
// protected - доступ имеют методы класса и его наследники
class Dog {

    // конструктор - нужен, чтобы правильно инициализировать
    // свойства экзепляра класса

//    public Dog(String dogBreed, String dogName, int dogAge, String dogColor){
//
//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;
//    }

    public Dog(String breed, String name, int age, String color) {
        // this - текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // конструктор по-умолчанию

    public Dog() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30)
        this.age = age;
    }

    // меняйте возраст собаки только если от больше 0 и меньше 30

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // свойства == переменные класса == поля класса
    private String breed;
    private String name;
    private int age;
    private String color;

    // методы == функции == действия
    void bark()
    {
        // гавкнуть
        System.out.println(name + "bark-bark ");
       // hello();
    }

    public static int numberOfDogs = 2;

    // сделайте статическую функцию hello которая печатает на экране
    // и вызовите её из main

    public static void hello() {
        System.out.println("Hello");

//        private final String color;
        //    public void setColor(String color) {
//        this.color = color;
//    }
//        public Dog() {
//            this.color = null; }
        }
    }
