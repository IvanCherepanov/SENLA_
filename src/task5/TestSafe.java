package task5;

import java.util.List;
import java.util.Scanner;

public class TestSafe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input capacity: ");

        String inputCapacity = scanner.nextLine();
        Safe safe=new Safe(Integer.parseInt(inputCapacity));

        System.out.println("Input numberOfItem: ");
        String inputCount = scanner.nextLine();

        ListOfItems listOfItems=new ListOfItems();

        for (int i=0;i<Integer.parseInt(inputCount);i++){
            listOfItems.pushItem();
        }
        listOfItems.setSafe(safe);
        listOfItems.calculateBest();
    }
}
