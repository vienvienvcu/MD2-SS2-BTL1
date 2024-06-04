import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();


        if(number % 3==0 && number %5==0){
            System.out.println(number + ":so chia het cho ca 3 va 5");
        }else if(number %5 == 0){
            System.out.println(number + ":so chia het cho 5");
        } else if (number %3 == 0) {
            System.out.println(number + ":so chia het cho 3");
        }else {
            System.out.println(number + ":“Không chia hết cho 3 , cũng không chia hết cho 5”.");
        }

    }
}
