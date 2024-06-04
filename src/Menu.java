import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0){
            System.out.println("============Menu===========");
            System.out.println("1. kiem tra tinh chan le cua mot so:");
            System.out.println("2. kiem tra so nguyen to:");
            System.out.println("3. kiem tra mot so co chia het cho 3");
            System.out.println("4. Exit");
            choice = input.nextInt();
            int number;
            switch (choice){
                case 1:
                    System.out.println("nhap vao mot so guyen duong");
                    number = input.nextInt();
                    if (number % 2 == 0){
                        System.out.println("so do la so chan: " + number);
                    }else {
                        System.out.println("so do la so le: " + number);
                    }
                    break;
                case 2:
                    System.out.println("nhap vao mot so guyen duong");
                    number = input.nextInt();
                    boolean check = true;
                    int i = 2;
                    while (i<number){
                        if (number % i == 0 ){
                            check = false;
                        }
                        i++;
                    }
                    if (check){
                        System.out.println("so do la so nguyen to: " + number);
                    }else {
                        System.out.println("so do k phai la so nguyen to: " + number);
                    }
                    break;
                case 3:
                    System.out.println("nhap vao mot so guyen duong");
                    number = input.nextInt();
                    if (number % 3 == 0){
                        System.out.println("so do la so co chia het cho 3: " + number);
                    }else {
                        System.out.println("so do la so k chia het cho 3: " + number);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("no choice");

            }
        }
    }
}
