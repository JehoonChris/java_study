package exmaple10;

public class ArrayEx01 {
    public static void main(String[] args) {

        //score는 참조변수이다
        int[] score = null;

        //방없이 값을 대입못함
        //score = {100,29};

        score = new int[5];

        System.out.println("score의 주소값 : " + score);

        for(int i=0; i<score.length; i++){
            System.out.println("score["+i+"] = " + score[i]);
        }

        System.out.println();
        //score[0]은 변수와동일하다고 보면 됨
        //score는 주소 []안에 들어가는 숫자는 인덱스임
        score[0] = 100;

        for(int i=0; i<score.length; i++){
            score[i] = i + 10;
        }

        for(int i=0; i<score.length; i++){
            System.out.println("score["+i+"] = " + score[i]);
        }


    }
}
