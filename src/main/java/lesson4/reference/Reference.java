package lesson4.reference;

public class Reference {
    public static void main(String[] args) {
        // int, double, char, float, boolean, byte, long, short
        // String, Integer, Double, []-массив

        int a[] = new int[1];
        a[0] = 10;
        changeArray(a);
        System.out.println(a[0]);
    }

    public static void changeArray(int [] array) {
        array[0] = 1000;
    }

}
