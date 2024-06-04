import java.util.Scanner;

public class Findpositive {
    public static void main(String[] args) {
        int n = 1;
        while (n > 0 ){
            if (n%7 == 0 && n% 5== 0 && n % 11==0){
                System.out.println(n+ "la so nguyen duong can tim");
                break;
            }
            n++;
        }

    }
}
