package example04;

public class AcuuracyEx {
    public static void main(String[] args) {
        //CPU의 연산의 오차
        int apple = 1;
        double unit = 0.1;
        int number = 7;

        double result = apple - (number * unit);
        double result2 = (number * unit);

        System.out.println(result2);

        System.out.println("사과 한개에서 ");
        System.out.println("0.7조각 을 빼면, ");
        System.out.println(result + " 조각이 남는다. ");
    }
}
