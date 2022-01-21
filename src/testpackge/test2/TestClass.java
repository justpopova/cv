package testpackge.test2;

import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num > 0) {
            num = -num;
        } else {
            num = num;
        }
        System.out.println(num);
    }
}