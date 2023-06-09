package lesson2.shape;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(15);
        figures[1] = new Rectangle(1, 2);
        figures[2] = new Triangle(2, 2, 1);

        System.out.println("perimeter: " + perimeter(figures));
        System.out.println("area: " + area(figures));
    }

    public static double perimeter(Figure[] figures) {
        double result = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null)
                result += figures[i].perimeter();
        }
        return result;
    }
    public static double area(Figure [] figures)
    {
        double result = 0;
        for(int i = 0; i < figures.length; i++)
        {
            if(figures[i] != null)
                result += figures[i].area();
        }
        return result;
    }
}
        // не могу создать экземпляр абсстрактного класса
        // Figure [] f = new Figure();



