import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so dau");
        int start = input.nextInt();
        System.out.println("nhap vao so cuoi");
        int end = input.nextInt();
        int total = 0;
        for ( int i = start ; i <= end ; i++ ) {
            if (i % 2 == 0 ){
                total += i;
            }
        }
        System.out.println("tong so can tim la: " + total);
    }
}
