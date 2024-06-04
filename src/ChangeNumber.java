import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        number = input.nextInt();
            switch (number){
                case 0:
                    System.out.println("so khong");
                    break;
                case 1:
                    System.out.println("so mot");
                    break;
                case 2:
                    System.out.println("so hai");
                    break;
                case 3:
                    System.out.println("so ba");
                    break;
                case 4:
                    System.out.println("so bon");
                    break;
                case 5:
                    System.out.println("so nam");
                    break;
                case 6:
                    System.out.println("so sau");
                    break;
                case 7:
                    System.out.println("so bay");
                    break;

            }
        }
    }

