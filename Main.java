public class Main {
    public static void main(String[] args) {
        // homework 1
        int a = 2;
        int b = 9;
        int c = 3;

        int Discriminant = b*b - (4 * a * c);

        System.out.println(Discriminant);



        // homework 2
        String[] Fruits = {"apple", "watermelon", "pear", "strawberry"};
        String mainFruit = Fruits[0];
        for (String fruit : Fruits) {
            if (mainFruit.length() > fruit.length()) {
                mainFruit = fruit;
            }
        }
        System.out.println(mainFruit);


        // homework 3
        Fraction f1 = new Fraction();

        f1.numerator = 1;
        f1.denominator = 3;

        Fraction f2 = new Fraction();

        f2.numerator = 3;
        f2.denominator = 4;


        int numerator1 = f1.numerator * f2.numerator;
        int Denominator1 =  f1.denominator * f2.denominator;

        System.out.println( numerator1 + " / " + Denominator1);



        int numerator2 = f1.numerator * f2.denominator + f2.numerator *f1.denominator;
        int denominator2 = f1.denominator * f2.denominator;

        System.out.println( numerator1 + " / " + denominator2);

    }
}