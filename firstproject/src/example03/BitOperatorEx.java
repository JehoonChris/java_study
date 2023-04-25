package example03;

public class BitOperatorEx {

    public static void main(String[] args) {

        //&, |, ^ 비트연산자

        int x = -8;
        int y = -5;

        System.out.println("x를 2진수로 변환 결과 : " + Integer.toBinaryString(x));
        System.out.println("y를 2진수로 변환 결과 : " + Integer.toBinaryString(y));

        //AND연산은 둘다 1일때만 1을 준다.
        //OR연산은 하나라도 1이면 1을 준다.
        //XOR(exclusive or)배타적 논리합 : 서로 다를때 1을 준다.

        System.out.println("x와 y를 비트 & 연산결과 : " + (x & y));
        System.out.println("x와 y를 비트 | 연산결과 : " + (x | y));
        System.out.println("x와 y를 비트 ^ 연산결과 : " + (x ^ y));

    }

}
