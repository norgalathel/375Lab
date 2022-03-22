import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "Datasets/01-January.csv";
        File file = new File(fileName);
        //String[] valuesTest = new String[20];
        int[][] all = new int[12][3];
        int j=1;
        int i=1;
        try {
            Scanner fileInput = new Scanner(file);
            fileInput.next();
            while(fileInput.hasNext()){
                String data = fileInput.next();
                String[] values = data.split(",");
                //valuesTest = values;
                while(j<4){
                    all[i-1][j-1]=Integer.parseInt(values[j]);
                    j++;
                }
                if(j==4){
                    j=1;
                }
                i++;
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(valuesTest[1]);
        System.out.println(all[1][0]);
        System.out.println(all[1][1]);
        System.out.println(all[1][2]);
    }
}
