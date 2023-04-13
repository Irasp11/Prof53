package lesson4.Animals;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }
    public void greets(Dog dog) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog bigDog) {
        System.out.println("Wooooooooow");

    }
}
