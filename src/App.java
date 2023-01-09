import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o começo da iteração.");
        int num = scan.nextInt();
        System.out.println("Informe o fim da iteração.");
        int num2 = scan.nextInt();
        for (int i = num; i <= num2; i++) {
            String s = "";
            for (int j = 0; j < i; j++) {
                s += i;
            }
            System.out.println(s);
        }
    }
}
