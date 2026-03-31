import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
    }
}
