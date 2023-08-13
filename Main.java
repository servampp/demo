import java.util.Scanner; // import the Scanner class
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expr = sc.nextLine();
        System.out.println(calc(expr));
    }

    public static String calc(String input) throws IOException {
int ans;
        String expr = input.replaceAll("\\s", "");
        String ch = expr.replaceAll("[0-9]", "");

        if (expr.contains("([0-9])([-+*/])([0-9])")) {
            throw new IOException("Неверное выражение");
        }
        String[] data = expr.replaceAll("[-+*/]", " ").split(" ");


        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        if (a > 10 || a < 0 || b > 10 || b < 0) {
            throw new IOException("Число вне диапазона");
        }

        switch (ch) {
            case "+":
                ans = a + b;
                System.out.println(" = " + ans);
                break;
            case "-":
                ans = a - b;
                System.out.println(" = " + ans);
                break;
            case "*":
                ans = a * b;
                System.out.println(" = " + ans);
                break;
            case "/":
                ans = a / b;
                System.out.println(" = " + ans);
                break;
            default:
                throw new IOException();
        }
        if (ans == 0) {
            System.out.println();
        } else if (ans < 0) {
            System.out.println();
        } else {
            throw new IOException();
        }
        System.out.println(a + " " + ch + " " + b + " = " + ans);
        return input;

    }
}


