package example05;

public class If_if_elseEx {
    public static void main(String[] args) {

        int score = 93;

//        if(score > 90) {
//            System.out.println("점수가 90보다 큽니다");
//            System.out.println("등급은 A입니다");
//        }
//
//        if(score > 80) {
//            System.out.println("점수가 80보다 큽니다");
//            // System.out.println("등급은 A입니다");
//        }
//
//        if(score > 92) {
//            System.out.println("점수가 90보다 큽니다");
//            // System.out.println("등급은 A입니다");
//        }
        // if-else구문은 50%확률일 때, 사용함
        if(score >= 90) {
            System.out.println("90점 이상입니다");
        } else {
            System.out.println("90점 미만입니다");
        }
    }
}
