package example05;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("점수가 90~100점 사이입니다. ");
            System.out.println("등급은 A입니다. ");
        } else if(score >= 80) {
            System.out.println("점수가 80~89점 사이입니다. ");
            System.out.println("등급은 B입니다. ");
        } else if(score >= 70) {
            System.out.println("점수가 70~79점 사이입니다. ");
            System.out.println("등급은 C입니다. ");
        } else {
            System.out.println("점수가 70미만입니다. ");
            System.out.println("등급은 F입니다. ");
        }

        sc.close();
        }
    }
