package example08;

public class ForEx02 {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        //누적 합계가 2000이상일 떄 i의 값을 출력하시오.
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= 2000) {
                temp = 1;
                break;
            }
        }
        System.out.println("2000이상일때 sum의 값" + sum);
        System.out.println("2000이상일때 1을 추력 : " + temp);
        //System.out.println("1~100까지의 합 : " + sum);
    }
    }

