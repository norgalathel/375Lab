import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyThread extends Thread{
    public MyThread(String a){
        this.setFileName(a);
    }
    public void setFileName(String x){
        this.fileName = x;
    }
    
    String fileName;
    public void run(){
        File file = new File(fileName);

        int[][] all = new int[12][3];
        int[][] totalStock = new int[12][2];
        int[][] prices = new int[1][12];
        int[][] totalSales = new int[1][2];

        int j=1; //column iterator
        int i=1; //line iterator
        try {
            Scanner fileInput = new Scanner(file);
            fileInput.next();
            while(fileInput.hasNext()){
                String data = fileInput.next();
                String[] values = data.split(",");

                while(j<4){
                    all[i-1][j-1]=Integer.parseInt(values[j]);
                    j++;
                }
                if(j==4){
                    j=1;
                }
                i++;
            }
            i=1;
            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(i<12){
            totalStock[i-1][0]=all[i-1][1];
            totalStock[i-1][1]=all[i-1][2];
            prices[0][i-1]=all[i-1][0];
            
            totalSales[0][0] += totalStock[i-1][0]*prices[0][i-1]; 
            totalSales[0][1] += totalStock[i-1][1]*prices[0][i-1];
            i++;
        }
        System.out.println("In store: " +totalSales[0][0]+ ", online: " +totalSales[0][1]);
    }
}
