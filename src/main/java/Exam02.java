import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        num = s.nextInt();

        if (num % 15 != 0) {
            if (num % 3 == 0) {
                System.out.println("3의 배수입니다.");
            } else {
                System.out.println("5의 배수 입니다");
            }
        } else {
            System.out.println("3과 5의 배수 둘 다 만족합니다");
        }
    }
}