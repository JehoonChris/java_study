package example08;

import java.util.Scanner;

public class Input구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단을 출력합니다. ");
        System.out.println("몇 단부터 출력할까요? : ");
        int start = sc.nextInt();
        System.out.println("끝 단은 얼마인가요? : ");
        int end = sc.nextInt();

        for(;start<=end; start++){
            for(int j=1;j<10;j++){
                System.out.println("******" + start + "단 ******");
                System.out.println(start + " + " + j + " = " + (start*j));
            }
        }
        //무한루프
        //for(;;){
        //   System.out.println("------");
        //}



        sc.close();

    }
}
