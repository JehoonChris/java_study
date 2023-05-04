package example09;

public class WhileEx01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
//
//        //while문 옆에는 조건식만 들어감
//        while (i <= 100){
//            sum += i;
//            i++;
//;
//        }
        //C언에서는 boolean타입이 없어서 0은 거짓 나머지는 다 참
        while(true){
            i++;
            System.out.println(i);
            if (i>=100){
                break;
            }


        }

        //System.out.println("1부터 100까지의 합 : "+sum);

    }
}
