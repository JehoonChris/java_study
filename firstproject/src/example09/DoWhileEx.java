package example09;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하시려면 q를 입력하세요");
        String str = null;

        do{
            System.out.println(">");
            //String클래스의 next()메서드는 공백만날때 까지만
            str = sc.nextLine();
            System.out.println("입력받은 메세지 : " + str);

        }while(!str.equals("q"));
        System.out.println("프로그램 종료");

        sc.close();
    }
}
