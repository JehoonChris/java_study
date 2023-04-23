package example02;

public class DenyEx {
    public static void main(String[] args) {

        //!논리부정연산자 == not연산자 --> 반대값을 취하게 함

        boolean power = false;
        System.out.println("power의 값 : " + power);
        power = !power;
        System.out.println("power의 값 : " + power);
        power = !power;
        System.out.println("power의 값 : " + power);

        if(power) {
            System.out.println("if문 실행됨");
        }

    }
}
