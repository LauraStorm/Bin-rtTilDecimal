import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // creating scanner object - system: hvor man læser fra  in: keyboard

        //Show programs function
        System.out.println("Omregner fra binært tal til decimal tal");

        //Ask user to insert binært tal
        System.out.print("Indtast venligst bin tal: ");
        int binNumber = input.nextInt();

        //convert bin to dec:
        int decimal = 0;        //The result will be stored here
        int digits = 0;         //Counts the digits -

        while (true){
            if (binNumber == 0){
                break;
            } else {
                int temp = binNumber%10;                //modoluser input - så vi får et decimal
                decimal += temp * Math.pow(2,digits);   //udregner det decimal  og tilføjer det til variablen decimal
                binNumber = binNumber/10;               //gør inputtet mindre (det decimal vi lige har arbejdet med)
                digits++;
            }

        }
        System.out.println("Output:" + decimal);


    }
}
