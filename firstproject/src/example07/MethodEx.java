package example07;

public class MethodEx {
    //메서드의 선언부 구성
    //1. 리턴타입(반환값) : int
    //2. 메서드명
    //3. () : 매개변수, 인자값, arguments
    public static int add(int x, int y, int z){
        //int temp = 0;
        //temp = x + y + z;
        System.out.println("add메서드 호출됨");
        return x + y + z;
    }
    public static int minus(int x, int y){
        System.out.println("minus메서드 호출됨");
        return x - y;
    }

    public MethodEx() {
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;


        //call by value 값에 의한 복사
        int result = MethodEx.add(num1, num2, 100);
        System.out.println("num1 + num2 + 100 : " + result);
        result = minus(num1, num2);
        System.out.println("num1 - num2 : " + result);
    }
}
