package example.example;



public class Main {
    public static void main(String[] args) {

        String result = toUppercase("hello world");


        System.out.println(result);
    }




    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String toUppercase(String s) {
        return s.toUpperCase();
    }
    public static boolean isPositive(int number) {
        return number > 0;
    }

}


