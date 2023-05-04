package example08;

public class ForEx01 {
    public static void main(String[] args) {

        int sum = 0;
        //int i=1 -> 초기화 코드
        //i <= 100-> 조건식
        //i++ -> 증감식
        for (int i=1;i<=100;i++){
            sum += i;
            System.out.println("sum : " + sum);
        }
        System.out.println("1~100까지의 합 : " + sum);
    }
}
