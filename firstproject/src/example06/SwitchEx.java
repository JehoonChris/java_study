package example06;

public class SwitchEx {
    public static void main(String[] args) {

        int score = 95;

        switch(score/10) {
            case 9 :
                System.out.println("A등급입니다");
                break;
            case 8 :
                System.out.println("B등급입니다");
                break;
            case 7 :
                System.out.println("C등급입니다");
                break;
            default :
                System.out.println("D등급 이하 입니다. ");




        }
    }
}
