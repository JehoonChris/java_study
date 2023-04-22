package ch01;
import java.util.Scanner;
public class TestExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자여 ㄹ입력 : ");
        int result = 100;
        String num = sc.nextLine();
        int temp = Integer.parseInt(num);
        int total = result + temp;
        System.out.println("연산결과 ; " + total); // 여기선 잘됨

        sc.close();
    }
}
