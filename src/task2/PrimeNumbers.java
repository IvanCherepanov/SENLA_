package task2;

import java.util.Scanner;

public class PrimeNumbers {
    private int number=0;

    public void toPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth");

        String inputString = scanner.nextLine();

        try {
            number = Integer.parseInt(inputString);
        }
        catch (NumberFormatException numberFormatException){
            System.out.println("Not number");
            return;
        }

        if(number<0){
            System.out.println("Negative number");
        }
        else if(number==1){
            System.out.println(number);
            return;
        }

        for (int i=2;i<Math.sqrt(number);i++){
            while(number%i==0){
                System.out.print(i);
                System.out.print(" ");
                number/=i;
            }
        }

        if (number!=1){ // если число простое
            System.out.print(" ");
            System.out.print(number);
        }
    }

    public PrimeNumbers() {
    }
}
