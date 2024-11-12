import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int check;
        String header = InputHelper.getNonZeroLenString(scan, "Enter your phrase to be in a header.");

        //first 60
        for (int r = 0; r <= 59; r++) {
            System.out.print("*");
        }
        System.out.println();

        for (int r = 0; r <= 2; r++) {
            System.out.print("*");
        }

        int num = header.length() / 2;

        for (int r = 0; r <= 26 - num; r++) {
            System.out.print(" ");
        }
        System.out.print(header);

        if(header.length()%2 == 0){
            check = 26;
        }else {
            check = 25;
        }
        for (int r = 0; r <= check - num; r++) {
            System.out.print(" ");
        }

        for (int r = 0; r <= 2; r++) {
            System.out.print("*");
        }
        System.out.println();


        //second 60
        for (int r = 0; r <= 59; r++) {
            System.out.print("*");
        }
        System.out.println();

        }
}