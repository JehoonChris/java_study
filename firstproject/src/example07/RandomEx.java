package example07;

public class RandomEx {
    public static void main(String[] args) {


        //Math.random()값은 0.000000에서 0.999999사이
        //System.out.println(Math.random());


        //주사위 눈
        int num = (int)(Math.random()*7);
        System.out.println(num);

        if(num == 1){
            System.out.println("1이 나왔네요!");
        }
        else if(num == 2){
            System.out.println("2가 나왔네요");
        }
        else if(num == 3){
            System.out.println("3가 나왔네요");
        }
        else if(num == 4){
            System.out.println("4가 나왔네요");
        }
        else if(num == 5){
            System.out.println("5가 나왔네요");
        }
        else{
            System.out.println("6가 나왔네요");
        }
    }
}
