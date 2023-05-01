package example05;

import java.util.Scanner;

public class IfNested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();

        if(score >= 90) {
            if (score >- 95) {
                System.out.println("당신은 A+등급입니다. ");
            } else {
                System.out.println("당신은 A등급입니다. ");
            }
        }else if(score >= 80) {
            if(score >= 85) {
                System.out.println("당신은 B+등급입니다. ");
            }else {
                System.out.println("당신은 B등급입니다. ");
            }
        }

        sc.close();

    }
}
