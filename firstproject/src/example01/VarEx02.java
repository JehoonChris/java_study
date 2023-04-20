package example01;

public class VarEx02 {
    public static void main(String[] args) {

        int number; //4바이트 만큼 변수를 메모리(스택)을 할당함. 선언
        number = 200; //초기화
        int number2 = 500; //선언과 동시에 초기화

        double dnum = 10.01;


        //상수(변하지 않는 값)는 선언과 동시에 초기화를 한후, 다시 그 상수값을 변경시키느 코드가 들어가면 안된다.
        final int MAX_NUMBER = 100;
        // MAX_NUMBER = 200;

        System.out.println(number);
        System.out.println(number2);
        System.out.println("상수 : " + MAX_NUMBER);
        System.out.println("실수 : " + dnum);

        String str = new String("붕어빵");
        System.out.println(str);
        // null = 없다
        str = null;
        System.out.println(str);
    }
}
