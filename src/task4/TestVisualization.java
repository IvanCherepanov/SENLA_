package task4;

import java.util.Scanner;

public class TestVisualization {
    public static void main(String[] args) {
        VisualizingNumber visualizingNumber=new VisualizingNumber();

        visualizingNumber.create0("*");
        visualizingNumber.create1("*");
        visualizingNumber.create2("*");
        visualizingNumber.create3("*");
        visualizingNumber.create4("*");
        visualizingNumber.create5("*");
        visualizingNumber.create6("*");
        visualizingNumber.create7("*");
        visualizingNumber.create8("*");
        visualizingNumber.create9("*");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth number");
        String inputString = scanner.nextLine();

        char[] userCh = inputString.toCharArray();
        //System.out.println(visualizingNumber.maximum(Integer.parseInt(inputString)));

        switch (visualizingNumber.maximum(Integer.parseInt(inputString))){
            case 0:
                visualizingNumber.create0(Integer.toString(0));
                break;
            case 1:
                visualizingNumber.create1(Integer.toString(1));
                break;
            case 2:
                visualizingNumber.create2(Integer.toString(2));
                break;
            case 3:
                visualizingNumber.create3(Integer.toString(3));
                break;
            case 4:
                visualizingNumber.create4(Integer.toString(4));
                break;
            case 5:
                visualizingNumber.create5(Integer.toString(5));
                break;
            case 6:
                visualizingNumber.create6(Integer.toString(6));
                break;
            case 7:
                visualizingNumber.create7(Integer.toString(7));
                break;
            case 8:
                visualizingNumber.create8(Integer.toString(8));
                break;
            case 9:
                visualizingNumber.create9(Integer.toString(9));
                break;
        }

        //String[][] twoDimArray = new String[5][userCh.length*4];
        for(int i=0;i<5;i++){
            for(int k=0;k<userCh.length;k++){
                for(int j=0;j<4;j++){
                    switch (userCh[k]){
                        case '0':
                            System.out.print(visualizingNumber.digital0[i][j]);
                            break;
                        case '1':
                            System.out.print(visualizingNumber.digital1[i][j]);
                            break;
                        case '2':
                            System.out.print(visualizingNumber.digital2[i][j]);
                            break;
                        case '3':
                            System.out.print(visualizingNumber.digital3[i][j]);
                            break;
                        case '4':
                            System.out.print(visualizingNumber.digital4[i][j]);
                            break;
                        case '5':
                            System.out.print(visualizingNumber.digital5[i][j]);
                            break;
                        case '6':
                            System.out.print(visualizingNumber.digital6[i][j]);
                            break;
                        case '7':
                            System.out.print(visualizingNumber.digital7[i][j]);
                            break;
                        case '8':
                            System.out.print(visualizingNumber.digital8[i][j]);
                            break;
                        case '9':
                            System.out.print(visualizingNumber.digital9[i][j]);
                            break;
                    }
                }System.out.print("  ");
            }
            System.out.println();
        }
    }
}
