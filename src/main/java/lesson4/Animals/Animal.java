package lesson4.Animals;

import java.util.Objects;

public abstract class Animal {

    private String name;

   public Animal(String name) {
       this.name = name;
   }

   public abstract void greets();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);

    }
}
