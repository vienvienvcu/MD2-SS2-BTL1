import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("============MENU==============");
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2. Tính chu vi và diện tích hình tam giác");
        System.out.println("3. Tính chu vi và diện tích hình tròn.");
        System.out.println("4. Exit");
        System.out.println("your choice");
        choice = input.nextInt();
        while (choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println("input width hcn ");
                    int width = input.nextInt();
                    System.out.println("input height hcn");
                    int height = input.nextInt();
                    int C = (width + height) * 2;
                    int S = (width * height);
                    System.out.println("dien tich hinh chu nhat la: " + S);
                    System.out.println("chu vi hinh chu nhat la : "+ C);
                    break;
                case 2:
                    System.out.println("nhap vao canh ben trai");
                    float left = input.nextFloat();
                    System.out.println("nhap vao canh ben phai");
                    float right = input.nextFloat();
                    System.out.println("nhap vao canh day");
                    float bottom = input.nextFloat();
                    System.out.println("nhap vao chieu cao tam giac");
                    float hTriangle = input.nextFloat();
                    float cTriangle = (left + right + bottom);
                    float sTriangle = (bottom*hTriangle)/2;
                    System.out.printf("dien tich hinh tam giac la %.2f:" , sTriangle);
                    System.out.printf("chu vi htg la %.2f: " , cTriangle);
                    break;
                case 3:
                    System.out.println("nhap ban kinh hinh tron");
                    double r = input.nextDouble();
                    double cCircle = 2 * Math.PI * r;
                    double sCircle = Math.PI * Math.pow(r,2);
                    System.out.printf(" dien tich hinh tron la %.2f: " , sCircle);
                    System.out.printf(" chu vi hinh tron la %.2f ", cCircle);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("no choice");
            }
        }
    }
}
