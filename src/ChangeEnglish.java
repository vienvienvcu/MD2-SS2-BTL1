import java.util.Scanner;

public class ChangeEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào 1 số có 3 chữ số: ");
        int number = sc.nextInt();
        // 245 -> firstNumber = 2 , secondNumber = 4 , thirdNumber = 5

        // đơn giản 100 -> 999

        // < 100
        int firstNumber = number / 100;
        int secondNumber = number % 100 / 10;
        int thirdNumber = number % 10;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        // result = hàng trăm + hàng chục + hàng đơn vị

        String result = "";

        if (firstNumber == 0) {
            // số đầu tiên = 0 => số có 2 chữ số
            if (secondNumber == 0) {
                // số thứ 1 và số thứ 2 == 0 => số đơn
                result += hundredNumber(thirdNumber);
            } else {
                // số chục 45,67
                result += unitNumber(secondNumber, thirdNumber);
            }
        } else {
            // có 3 chữ số
            result = hundredNumber(firstNumber) + " hundred ";
            if (secondNumber == 0 && thirdNumber == 0) {
                // rơi vào trường hợp 100 - 200 - 300 -...- 900
                result += "";
            } else {
                // có thể lẻ 102, 103 hoặc các trường hợp còn lại 121,345,956
                result += "and " + unitNumber(secondNumber, thirdNumber);
            }
        }

        System.out.println(result);
    }

    public static String hundredNumber(int firstNumber) {
        String result = "";
        switch (firstNumber) {
            case 1:
                result += "one";
                break;
            case 2:
                result += "two";
                break;
            case 3:
                result += "three";
                break;
            case 4:
                result += "four";
                break;
            case 5:
                result += "five";
                break;
            case 6:
                result += "six";
                break;
            case 7:
                result += "seven";
                break;
            case 8:
                result += "eight";
                break;
            case 9:
                result += "nine";
                break;
            default:
                break;
        }
        return result;
    }


    public static String unitNumber(int secondNumber, int thirdNumber) {
        String result = "";
        if (secondNumber == 0) {
            switch (thirdNumber) {
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
        } else if (secondNumber == 1) {
            // trường hợp x11 -> x19
            switch (thirdNumber) {
                case 0:
                    result += "ten";
                    break;
                case 1:
                    result += "elevent";
                    break;
                case 2:
                    result += "twelve";
                    break;
                case 3:
                    result += "thirteen";
                    break;
                case 4:
                    result += "fourteen";
                    break;
                case 5:
                    result += "fifteen";
                    break;
                case 6:
                    result += "sixteen";
                    break;
                case 7:
                    result += "seventeen";
                    break;
                case 8:
                    result += "eighteen";
                    break;
                case 9:
                    result += "nineteen";
                    break;
            }
        } else {
            // secondNumber != 1
            // switch case hàng chục
            switch (secondNumber) {
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "forty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eighty";
                    break;
                case 9:
                    result += "ninety";
                    break;
            }
            // switch case hàng đơn vị
            switch (thirdNumber) {
                case 1:
                    result += "-one";
                    break;
                case 2:
                    result += "-two";
                    break;
                case 3:
                    result += "-three";
                    break;
                case 4:
                    result += "-four";
                    break;
                case 5:
                    result += "-five";
                    break;
                case 6:
                    result += "-six";
                    break;
                case 7:
                    result += "-seven";
                    break;
                case 8:
                    result += "-eight";
                    break;
                case 9:
                    result += "-nine";
                    break;
                default:
                    break;
            }
//            System.out.println(result);
        }
        return result;
    }
}
