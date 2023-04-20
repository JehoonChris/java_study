package example01;

public class VarEx01 {
    public static void main(String[] args) {
        char ch = 'A';
        int year = 0;
        int age = 18;
        //아래코드에서 L는 long를 지정하기 위해서 접미사 L를 붙였다.
        long result = 10L;
        //아래코드에서 F는 float를 지정하기 위해서 접미사 F,f를 붙였다.
        float result2 = 10.1F;
        double d = 9.999;
        //sout치고 엔터
        System.out.println("ch: "+ ch);
        System.out.println("long타입 출력: " + result);
        System.out.println("float타입 출력: " + result2);
        System.out.println(d);
        System.out.println(year + age);

        String str = new String("자바");
        System.out.println(str + "를 공부합니다");
        System.out.println(str.toString());

        //사용자정의클래스이거나 toString()재정의를 하지 않은
        // 클래스의 참조변수를 출력을 하게 되면, 클래스타입@16진수(주소)가 나온다

        Object obj1 = new Object();
        System.out.println(obj1 + "자바");

    }
}