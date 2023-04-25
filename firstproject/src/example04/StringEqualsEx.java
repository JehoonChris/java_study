package example04;

public class StringEqualsEx {
    public static void main(String[] args) {
        //참조형 타입의 ==, !=

        //리터럴인 경우는 같은 값이 heap에 있다면 같은 주소를 공유함
        String str1 = "아이티고";
        String str2 = "아이티고";
        int a = 10;

        //new연산자가 오면 무조건 새로운 인스턴스가 생성됨
        String str3 = new String("아이티고");

        //참조형 타입에서 서로 ==은 주소비교를 하고 있음
        //같은 리터럴의 경우는 같은 번지를 공유함
        boolean result = (str1 == str2);
        System.out.println("str1 == str2 : " + result);

        result = (str1 == str3);
        System.out.println("str1 == str3 : " + result);

        //String클래스의 equals()는 주소와 상관없이 값이 같다면 무조건 true를 리턴함
        result = str1.equals(str3);
        System.out.println("str1.equals(str3) : " + result);

        result = str1.equals(str2);
        System.out.println("str1.equals(str2) : " + result);

    }
}
