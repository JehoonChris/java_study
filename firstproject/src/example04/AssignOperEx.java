package example04;

public class AssignOperEx {
    public static void main(String[] args) {
        //복합대입 연산자

        int result = 0;
        //값을 누적시킬때
        result += 10; //result = result + 10
        System.out.println("result : "+result);

        result -= 5; //result = result -5
        System.out.println("result : " + result);

        result *= 5; //result = result *5
        System.out.println("result : " + result);

        result /= 5; //result = result /5
        System.out.println("result : " + result);

        result %= 5; //result = result  % 5
        System.out.println("result : " + result);
    }
}
