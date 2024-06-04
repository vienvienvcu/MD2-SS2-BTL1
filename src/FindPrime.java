import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to can tim ");
        int numbers = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers){
            boolean check = true;
                for ( int i = 0; i < n ;i++){
                    if (n % 2 == 0) {
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println( n + " is a prime");
                    n++;
                    count ++;
                }else {
                    n++;
                }
            }
        }

    }

