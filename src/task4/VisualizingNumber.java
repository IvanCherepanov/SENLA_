package task4;

import java.util.Scanner;

public class VisualizingNumber {
    String[][] digital0;
    String[][] digital1;
    String[][] digital2;
    String[][] digital3;
    String[][] digital4;
    String[][] digital5;
    String[][] digital6;
    String[][] digital7;
    String[][] digital8;
    String[][] digital9;

    public void create0(String c){

        digital0 = new String[5][4];

        digital0[0][0] = c;
        digital0[0][1] = c;
        digital0[0][2] = c;
        digital0[0][3] = c;

        digital0[1][0] = c;
        digital0[1][1] = " ";
        digital0[1][2] = " ";
        digital0[1][3] = c;

        digital0[2][0] = c;
        digital0[2][1] = " ";
        digital0[2][2] = " ";
        digital0[2][3] = c;

        digital0[3][0] = c;
        digital0[3][1] = " ";
        digital0[3][2] = " ";
        digital0[3][3] = c;

        digital0[4][0] = c;
        digital0[4][1] = c;
        digital0[4][2] = c;
        digital0[4][3] = c;
    }
    public void create1(String c){

        digital1 = new String[5][4];

        digital1[0][0] = " ";
        digital1[0][1] = " ";
        digital1[0][2] = c;
        digital1[0][3] = " ";

        digital1[1][0] = " ";
        digital1[1][1] = c;
        digital1[1][2] = c;
        digital1[1][3] = " ";

        digital1[2][0] = c;
        digital1[2][1] = " ";
        digital1[2][2] = c;
        digital1[2][3] = " ";

        digital1[3][0] = " ";
        digital1[3][1] = " ";
        digital1[3][2] = c;
        digital1[3][3] = " ";

        digital1[4][0] = c;
        digital1[4][1] = c;
        digital1[4][2] = c;
        digital1[4][3] = c;
    }
    public void create2(String c){

        digital2 = new String[5][4];

        digital2[0][0] = " ";
        digital2[0][1] = c;
        digital2[0][2] = c;
        digital2[0][3] = c;

        digital2[1][0] = c;
        digital2[1][1] = " ";
        digital2[1][2] = c;
        digital2[1][3] = " ";

        digital2[2][0] = " ";
        digital2[2][1] = c;
        digital2[2][2] = " ";
        digital2[2][3] = " ";

        digital2[3][0] = c;
        digital2[3][1] = " ";
        digital2[3][2] = " ";
        digital2[3][3] = " ";

        digital2[4][0] = c;
        digital2[4][1] = c;
        digital2[4][2] = c;
        digital2[4][3] = c;
    }
    public void create3(String c){

        digital3 = new String[5][4];

        digital3[0][0] = c;
        digital3[0][1] = c;
        digital3[0][2] = c;
        digital3[0][3] = c;

        digital3[1][0] = " ";
        digital3[1][1] = " ";
        digital3[1][2] = c;
        digital3[1][3] = " ";

        digital3[2][0] = " ";
        digital3[2][1] = c;
        digital3[2][2] = " ";
        digital3[2][3] = " ";

        digital3[3][0] = " ";
        digital3[3][1] = " ";
        digital3[3][2] = c;
        digital3[3][3] = " ";

        digital3[4][0] = c;
        digital3[4][1] = c;
        digital3[4][2] = c;
        digital3[4][3] = c;
    }
    public void create4(String c){

        digital4 = new String[5][4];

        digital4[0][0] = " ";
        digital4[0][1] = " ";
        digital4[0][2] = c;
        digital4[0][3] = " ";

        digital4[1][0] = " ";
        digital4[1][1] = c;
        digital4[1][2] = c;
        digital4[1][3] = " ";

        digital4[2][0] = c;
        digital4[2][1] = " ";
        digital4[2][2] = c;
        digital4[2][3] = " ";

        digital4[3][0] = c;
        digital4[3][1] = c;
        digital4[3][2] = c;
        digital4[3][3] = c;

        digital4[4][0] = " ";
        digital4[4][1] = " ";
        digital4[4][2] = c;
        digital4[4][3] = " ";
    }
    public void create5(String c){
        digital5 = new String[5][4];

        digital5[0][0] = c;
        digital5[0][1] = c;
        digital5[0][2] = c;
        digital5[0][3] = c;

        digital5[1][0] = c;
        digital5[1][1] = " ";
        digital5[1][2] = " ";
        digital5[1][3] = " ";

        digital5[2][0] = c;
        digital5[2][1] = c;
        digital5[2][2] = c;
        digital5[2][3] = c;

        digital5[3][0] = " ";
        digital5[3][1] = " ";
        digital5[3][2] = " ";
        digital5[3][3] = c;

        digital5[4][0] = c;
        digital5[4][1] = c;
        digital5[4][2] = c;
        digital5[4][3] = c;
    }
    public void create6(String c){
        digital6 = new String[5][4];

        digital6[0][0] = c;
        digital6[0][1] = c;
        digital6[0][2] = c;
        digital6[0][3] = c;

        digital6[1][0] = c;
        digital6[1][1] = " ";
        digital6[1][2] = " ";
        digital6[1][3] = " ";

        digital6[2][0] = c;
        digital6[2][1] = c;
        digital6[2][2] = c;
        digital6[2][3] = c;

        digital6[3][0] = c;
        digital6[3][1] = " ";
        digital6[3][2] = " ";
        digital6[3][3] = c;

        digital6[4][0] = c;
        digital6[4][1] = c;
        digital6[4][2] = c;
        digital6[4][3] = c;
    }
    public void create7(String c){

        digital7 = new String[5][4];

        digital7[0][0] = c;
        digital7[0][1] = c;
        digital7[0][2] = c;
        digital7[0][3] = c;

        digital7[1][0] = " ";
        digital7[1][1] = " ";
        digital7[1][2] = " ";
        digital7[1][3] = c;

        digital7[2][0] = " ";
        digital7[2][1] = " ";
        digital7[2][2] = c;
        digital7[2][3] = " ";

        digital7[3][0] = " ";
        digital7[3][1] = c;
        digital7[3][2] = " ";
        digital7[3][3] = " ";

        digital7[4][0] = c;
        digital7[4][1] = " ";
        digital7[4][2] = " ";
        digital7[4][3] = " ";
    }
    public void create8(String c){
        digital8 = new String[5][4];

        digital8[0][0] = c;
        digital8[0][1] = c;
        digital8[0][2] = c;
        digital8[0][3] = c;

        digital8[1][0] = c;
        digital8[1][1] = " ";
        digital8[1][2] = " ";
        digital8[1][3] = c;

        digital8[2][0] = " ";
        digital8[2][1] = c;
        digital8[2][2] = c;
        digital8[2][3] = " ";

        digital8[3][0] = c;
        digital8[3][1] = " ";
        digital8[3][2] = " ";
        digital8[3][3] = c;

        digital8[4][0] = c;
        digital8[4][1] = c;
        digital8[4][2] = c;
        digital8[4][3] = c;
    }
    public void create9(String c){
        digital9 = new String[5][4];

        digital9[0][0] = c;
        digital9[0][1] = c;
        digital9[0][2] = c;
        digital9[0][3] = c;

        digital9[1][0] = c;
        digital9[1][1] = " ";
        digital9[1][2] = " ";
        digital9[1][3] = c;

        digital9[2][0] = c;
        digital9[2][1] = c;
        digital9[2][2] = c;
        digital9[2][3] = " ";

        digital9[3][0] = " ";
        digital9[3][1] = c;
        digital9[3][2] = " ";
        digital9[3][3] = " ";

        digital9[4][0] = c;
        digital9[4][1] = " ";
        digital9[4][2] = " ";
        digital9[4][3] = " ";
    }
    public int maximum(int num){
          int maxi=0;
          while (num>0){
              if(num%10>maxi) maxi=num%10;
              num/=10;
          }
          return maxi;
    }

}
