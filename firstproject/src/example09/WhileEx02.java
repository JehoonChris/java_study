package example09;

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("---------------------------");
            System.out.println("1, 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------------------");
            System.out.println("입력 : ");
            int choice = sc.nextInt();
            if(choice == 1){
                speed++;
                System.out.println("현재속도 : " + speed);
            }
            else if(choice == 2){
                speed--;
                System.out.println("현재속도 : " + speed);
            }
            else if(choice == 3){
                //break;
                //System.exit(0); 이건 그냥 프로그램 자체를 닫아버림
                run = false;
            }
            else{
                System.out.println("질못된 입력 값입니다. ");
            }
        }
        System.out.println("프로그램 종료");

        sc.close();
    }


}
