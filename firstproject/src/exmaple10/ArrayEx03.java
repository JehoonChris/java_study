package exmaple10;

import java.util.Arrays;

public class ArrayEx03 {
    public static void main(String[] args) {


        //40바이트가 힙에 생성
        int[] arr1 = new int[10];
        char[] chArr = new char[]{'a', 'b', 'c'};

        //arr1배열에다 난수를 10개 대입
        for(int i=0; i<arr1.length; i++){
            arr1[i] = (int)(Math.random()*10)+1;
        }

        //배열의 값을 출력
        for(int i=0; i<arr1.length; i++){
            if(i == 9){
                System.out.print(arr1[i]);
            }
            else{
                System.out.print(arr1[i]+", ");
            }
        }
        System.out.println();
        //Arrays = 배열 조작 유틸리티
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(chArr));

        //주소값 출력
        System.out.println(arr1);
        //char타입의 주소를 출력할려면 toString()호출해야함
        System.out.println(chArr.toString());
    }
}
