import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter in score math: " + "\n");
        float math = input.nextFloat();
        System.out.println("enter in score physical: " + "\n");
        float physical = input.nextFloat();
        System.out.println("enter in score chemistry: " + "\n");
        float chemistry = input.nextFloat();
        System.out.println("enter in score literature: " + "\n");
        float literature = input.nextFloat();
        System.out.println("enter in score english: " + "\n");
        float english  = input.nextFloat();

        float average = (math + physical + chemistry + literature + english)/5;

        if (average>= 0 && average <5){
            System.out.println(average + "=>"+ "Xếp loại yếu ");
        } else if (average>=5 && average <6.5) {
            System.out.println(average + "=>"+ "Xếp loại trung bình");
        } else if (average >= 6.5 && average <8) {
            System.out.println(average + "=>"+ "Xếp loại khá");
        } else if (average>=8 && average <9) {
            System.out.println(average + "=>"+ "Xếp loại giỏi");
        }else {
            System.out.println(average + "=>"+ "Xếp loại xs");
        }
    }
}
