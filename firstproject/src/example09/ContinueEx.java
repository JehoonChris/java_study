package example09;

public class ContinueEx {
    public static void main(String[] args) {
//
//        for(int i=1; i<=100; i++){
//
//            if((i%2) != 0 ) {
//                continue;
//            }
//            System.out.println("짝수 : " + i);
//        }

//        for(int i=1; i<=100; i++){
//
//            if((i%2) == 0 && (i%3) == 0) {
//                System.out.println("2와3의 공배수 : " + i);
//            }
//
//        }
        //소수만 출력
        for(int i=1; i<=100; i++){
            if((i%2 == 0) || (i%3 == 0) || (i%5 == 0) || (i%7 == 0)){
                continue;
            }
            System.out.println("소수 : " + i);
        }

    }
}
