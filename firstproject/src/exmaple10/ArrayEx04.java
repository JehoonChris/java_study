package exmaple10;

import java.util.Arrays;

public class ArrayEx04 {
    public static void main(String[] args) {

        int[] ball = new int[5];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = (int) (Math.random() * 20) + 1;
        }
        System.out.println("정렬 전");
//        for (int i = 0; i < ball.length; i++) {
//            System.out.println(ball[i]);
//        }
//        System.out.println();
        //버블소팅
//        for (int i = 0; i < ball.length; i++) {
//            for (int j = 0; j < ball.length - 1; j++) {
//                if (ball[j] < ball[j + 1]) {
//                    int temp = ball[j];
//                    ball[j] = ball[j + 1];
//                    ball[j + 1] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(ball));
        Arrays.sort(ball);
        System.out.println(Arrays.toString(ball));

        System.out.println("정렬 후");
//        for (int i = 0; i < ball.length; i++) {
//            System.out.println(ball[i]);


        //}
    }
}
