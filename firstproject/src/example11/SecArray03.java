package example11;

import java.util.Scanner;

public class SecArray03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] student;
        int count = 0, num = 0, total = 0, sum = 0;
        double avg = 0.0;
        double avgTotal = 0.0;

        System.out.println("반수 입력 : " );
        count = sc.nextInt();
        student = new int[count][];
//        System.out.println("2차원 배열주소 : " + student);
  //      System.out.println("1차원 배열방 크기 : " + student.length);
        for(int i=0; i<student.length; i++){
            System.out.printf("%d반의 인원 : ", i+1);
            num = sc.nextInt();
            student[i] = new int[num];

            for(int j=0;j<student[i].length; j++){
                System.out.printf("%d반의 %d번의 점수 : ", (i+1), (j+1));
                student[i][j] = sc.nextInt();
            }
            System.out.println();
        }
//        for(int i = 0; i<student.length; i++){
//            for(int j = 0; j<student[i].length; j++){
//                System.out.println(student[i][j]);
//            }
//        }
        System.out.println("반\t합계\t평균\t");
        System.out.println("==========================");

        for(int i=0; i<student.length; i++){
            sum = 0;
            for(int j=0; j<student[i].length; j++){
                sum += student[i][j];
            }
            total += sum;
            avg = (double)sum / student[i].length;
            avgTotal += avg;
            System.out.printf("%d반\t%d\t%.1f\n", i+1, sum, avg);
        }
        avgTotal = avgTotal / student.length;
        System.out.printf("계\t%d\t%.1f\n", total, avgTotal);



        sc.close();
    }
}
