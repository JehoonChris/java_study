package exmaple10;

public class ArrayEx02 {
    public static void main(String[] args) {

        int sum = 0;
        double avg = 0.0;

        int[] score = new int[]{100,200,300};
        System.out.println("배열의 크기 : " + score.length);

        for(int i=0; i<score.length; i++){
            sum += score[i];
        }
        System.out.println("총점 : " + sum);

        avg = sum/score.length;

        System.out.println("평균 : " + avg);

    }
}
