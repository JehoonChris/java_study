package example03;

public class DefaultTypeEx {

    public static void main(String[] args) {

        byte b1 = 127;
        byte b2 = 1;
        char ch = 'A';
        float f1 = 15.5f;
        double d1 = 10.5;


        //1번째 방법 : int형으로 받아주면 된다.
        //2번째 방법 : 강제 캐스팅을 한다.
        int i1 = b1 + b2;
        byte b3 = (byte)(b1 + b2); //byte + byte = int + int = int
        int i2 = ch + b2;

        //정수형 + 실수형 --> 표현범위가 넓은 쪽으로 형변환 한다.
        float f2 = b1 + f1;
        double d2 = f1 + d1;

        System.out.println(i1 + " , " + b3 + " , " + i2 + " , " + f2);
        System.out.println(d2);

    }

}
