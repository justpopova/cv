import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        if (num>0){
            num = -num;
        }
        else {
            num = num;
        }
        System.out.println(num);
    }
}