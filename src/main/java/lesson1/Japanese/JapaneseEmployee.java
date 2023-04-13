package lesson1.Japanese;

public class JapaneseEmployee {
    public static void main(String[] args) {
        JapaneseEmployee misuo = new JapaneseEmployee("Mitsuo", "Baso", 120_000, 4);

        JapaneseEmployee akira = new JapaneseEmployee("Akira", "Kurosava", 100_000, 12);

        System.out.println(misuo.getFirstName() + " " + misuo.calculateSalary());
        System.out.println(akira.getFirstName() + " " + akira.calculateSalary());
    }

        public void hello()
        {
            // если работник работает больше 10 лет преветствовать его
//            // Добрый день имя фамилия
//            // если меньше то
//            // Привет имя

            if (years >= 10)
                System.out.println("Добрый день " + firstName + " " + lastName);
            else
                System.out.println("Привет " + firstName);
            }

            private String firstName;
            private String lastName;
            private double baseSalary;
            private int years;

            public static int delta = 10_000;

            public int calculateSalary()
            {
                // return базовая зарплата + количество лет * delta
                return (int) baseSalary + delta * years;
            }
        // создайте конструктор со всеми параметрами
       // создайте геттеры и сеттеры
    public JapaneseEmployee(String firstName, String lastName, double baseSalary, int years){
                this.firstName = firstName;
                this.lastName = lastName;
                this.baseSalary = baseSalary;
                this.years = years;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName){
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName){
                this.lastName = lastName;
            }

            public double getBaseSalary() {
                return baseSalary;
            }

            public void setBaseSalary(double baseSalary){
                this.baseSalary = baseSalary;
            }

            public int getYears() {
                return years;
            }

            public void setYears(int years){
                this.years = years;
            }
        }

