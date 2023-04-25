package example04;

import java.util.Scanner;

public class ThreeOperEx {
    public static void main(String[] args) {
        //삼항 연산자
        Scanner sc = new Scanner(System.in);

        //(조건식) ? 1 : 2
        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        char grade = (score >= 90) ? 'A' : 'B';
        System.out.println("당신의 등급은 : " + grade);

        //삼항연산자를 중첩
        grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.println("당신의 등급은 : " + grade);

        
        sc.close();


    }
}
