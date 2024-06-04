import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        float left ;
        float right;
        float bottom;
        float total;
        while (check){
            System.out.println("nhap vao cach ben trai cuar tam giac");
             left = scanner.nextFloat();
            System.out.println("nhap vao canh ben phai cua tam gia");
             right = scanner.nextFloat();
            System.out.println("nhap vao canh day cua tam giac");
             bottom = scanner.nextFloat();
             total = left + right;
             if (left > 0 && right > 0 && bottom > 0 && bottom < total){
                 float c = (left + right +bottom);
                 System.out.println("nhap vao chieu cao cua tam giac");
                 float h = scanner.nextFloat();
                 float s = (bottom*h)/2;
                 System.out.printf("chu vi cua tam giac la %.2f dien tich cua tam giac %.2f: ",c, s);
             }else {
                 check =false;
                 System.out.println("so ban nhap k hop le, moi ban nhap lai:");

             }

        }
    }
}
