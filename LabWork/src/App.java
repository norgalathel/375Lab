import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class App {
    public static void main(String[] args) throws Exception {
        String[] fileNames = {"C:/Users/esram/375Lab/LabWork/Datasets/01-January.csv","C:/Users/esram/375Lab/LabWork/Datasets/02-February.csv","C:/Users/esram/375Lab/LabWork/Datasets/03-March.csv","C:/Users/esram/375Lab/LabWork/Datasets/04-April.csv","C:/Users/esram/375Lab/LabWork/Datasets/05-May.csv","C:/Users/esram/375Lab/LabWork/Datasets/06-June.csv", "C:/Users/esram/375Lab/LabWork/Datasets/07-July.csv", "C:/Users/esram/375Lab/LabWork/Datasets/08-August.csv", "C:/Users/esram/375Lab/LabWork/Datasets/09-September.csv", "C:/Users/esram/375Lab/LabWork/Datasets/10-October.csv", "C:/Users/esram/375Lab/LabWork/Datasets/11-November.csv", "C:/Users/esram/375Lab/LabWork/Datasets/12-December.csv"};
        int i = 0;
        System.out.println("Which product do you want to search?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        input.close();
        int answerToInt=99;

        

        switch(answer){
            case "A":
            answerToInt=0;
            break;
            case "B":
            answerToInt=1;
            break;
            case "C":
            answerToInt=2;
            break;
            case "D":
            answerToInt=3;
            break;
            case "E":
            answerToInt=4;
            break;
            case "F":
            answerToInt=5;
            break;
            case "G":
            answerToInt=6;
            break;
            case "H":
            answerToInt=7;
            break;
            case "J":
            answerToInt=8;
            break;
            case "K":
            answerToInt=9;
            break;
            case "L":
            answerToInt=10;
            break;
            case "M":
            answerToInt=11;
            break;
            default:
            System.out.println("You entered a wrong answer.");
            System.exit(0);
        }

        while(i<12){
            MyThread t = new MyThread(fileNames[i], answerToInt);
            t.run();
            i++;
        }
    }
}
