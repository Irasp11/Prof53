package lesson3.champagne;

public enum Cru {

    // создать перчисление с тремя элементами\


    AUTRE(80),
    PREMIER(90),
    GRAND(100);

    // добавить поле качество

    // AUTRE 80
    // PREMIER 90
    // GRAND 100

    private int quality;

    // добавить конструктор
    Cru(int quality) {

        this.quality = quality;
    }

    // добавить геттер

    public int getQuality() {

        return quality;
    }


    // с каждым элементом связать качество
    public static void main(String[] args) {

        Cru autre = Cru.AUTRE;
        System.out.println(autre.getQuality()); // 80

        Cru premier = Cru.PREMIER;
        System.out.println(premier.getQuality()); // 90

        Cru grand = Cru.GRAND;
        System.out.println(grand.getQuality()); // 100
    }
    // AUTRE 80
    // PREMIER 90
    // GRAND 100


}
