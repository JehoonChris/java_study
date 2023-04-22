package example01;

import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        //scanner클래스는 입력을 받기 위한 클래스이고, 입력스트림
        //자원(Resource)은 사용하고 나서 반드시 닫아줘야 된다.
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 한자리를 입력 : ");
        int num = sc.nextInt();
        System.out.println("사용자로부터 입력받은 숫자 : " + num);


        System.out.println("실수 한자리를 입력 : ");
        double dnum = sc.nextDouble();
        System.out.println("사용자로부터 입력받은 숫자 : " + dnum);

        System.out.println("문자열을 입력 : ");
        //next는 공백을 기준으로 해서문자를 입력 -- 단어를 입력
        //String str = sc.next();
        //nextLine()은 엔터키를 기준으로 해서 문자열을 입력 -- 문장을 입력
        //String str = sc.nextLine();
        //System.out.println("사용자로부터 입력받은 문자열 : " + str);


        int result = 100;
        String num2 = sc.nextLine();
        int temp = Integer.parseInt(num2); //Integer.parseInt()는 문자열로 입력받은 숫자들을 숫자로 바꿈
        int total = result + temp;
        System.out.println("연산결과 : " + total);// 아니 뭐가 문제인지 모르겠는데 안됨
        sc.close();
    }
}
