package lesson4.Animals;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.greets();

        // Создать  Dog and BigDog и посмотреть как они
        // приветствуют друг друга

        Dog dog = new Dog("Bobby");
        BigDog bigDog = new BigDog("Biggy");

        dog.greets(dog);
        dog.greets(bigDog);

        bigDog.greets(dog);
        bigDog.greets(bigDog);

    }
}
