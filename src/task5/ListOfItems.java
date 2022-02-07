package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfItems {
    private List<Item> list=new ArrayList<>();
    private int listCapacity;
    private Safe safe=new Safe(0);//for capacity
    Scanner scanner = new Scanner(System.in);

    public void setSafe(Safe safe) {
        this.safe = safe;
    }

    public ListOfItems() {
    }
    public void pushItem(){
        System.out.println("Input name: ");
        String inputString = scanner.nextLine();
        System.out.println("Input volume: ");
        String inputV = scanner.nextLine();
        System.out.println("Input price: ");
        String inputP = scanner.nextLine();
        Item temp = new Item(inputString,Integer.parseInt(inputV),Integer.parseInt(inputP));
        list.add(temp);
    }

    public int getListCapacity() {
        return listCapacity;
    }

    public void printItemsAll(){
        for (Item item:list
             ) {
            System.out.println("Name:"+item.getName()+". Volume: "+item.getVolume()+". Price:"+item.getPrice());

        }
    }
    public List<Item> getAr(){
        return list;
    }


    public void calculateBest(){
        //System.out.println(list.size()+" "+ safe.getCapacity());
        int A[][] = new int[list.size()+1][safe.getCapacity() + 1];
        for (int i=0;i<=list.size();i++){
            for(int j=0;j<= safe.getCapacity();j++){
                if(i==0||j==0){
                    A[i][j]=0;
                }
                else if (list.get(i-1).getVolume()<=j){
                    A[i][j]=Math.max(list.get(i-1).getPrice()+A[i-1][j-list.get(i-1).getVolume()],A[i-1][j]);
                }
                else{
                    A[i][j]=A[i-1][j];
                }
            }
        }
        System.out.println(A[list.size()][safe.getCapacity()]);
    }
}
