class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}
