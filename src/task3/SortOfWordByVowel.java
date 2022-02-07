package task3;

import java.util.Locale;
import java.util.Scanner;

public class SortOfWordByVowel {
    public void sortingVowel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth");

        String inputString = scanner.nextLine();
        inputString = inputString.replaceAll("\\s+", " ");//delete more 1 gap
        inputString = inputString.trim();//delete first and last gap
        inputString = inputString.toLowerCase();//to same register
        String[] wordMas = inputString.split(" ");//group by gaps

        String vowel = "аеёиоуыэюя";//only russian by task

        int[] count = new int[wordMas.length];//massive for vowel in word

        for (int i=0;i<wordMas.length;i++){
            for (int j=0;j<wordMas[i].length();j++){
                if (vowel.indexOf(wordMas[i].charAt(j))>=0){
                    count[i]+=1;
                }
            }
            System.out.println(wordMas[i]+" "+count[i]);
        }

        System.out.println("\nSort by number of vowels:");

        for (int i=0;i<wordMas.length;i++){
            for (int j=i;j<wordMas.length;j++){
                if (count[i]<count[j]){
                    String temp=wordMas[i];
                    wordMas[i]=wordMas[j];
                    wordMas[j]=temp;
                    int tempCount=count[i];
                    count[i]=count[j];
                    count[j]=tempCount;
                }
            }
        }
        for (String item: wordMas
             ) {
            System.out.println(item);
        }

        System.out.println("\nDo first alph Upper:");

        for (int i=0;i<wordMas.length;i++){
            for (int j=0;j<wordMas[i].length();j++){
                if (vowel.indexOf(wordMas[i].charAt(j))>=0){
                    wordMas[i]=wordMas[i].substring(0,j)+Character.toUpperCase(wordMas[i].charAt(j))+wordMas[i].substring(j+1,wordMas[i].length());
                    break;
                }
            }
            System.out.print(wordMas[i]+" ");
        }
    }
}
