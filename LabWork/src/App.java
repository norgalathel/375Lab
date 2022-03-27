public class App {

    
    public static void main(String[] args) throws Exception {
        String[] fileNames = {"Datasets/01-January.csv","Datasets/02-February.csv","Datasets/03-March.csv","Datasets/04-April.csv","Datasets/05-May.csv","Datasets/06-June.csv", "Datasets/07-July.csv", "Datasets/08-August.csv", "Datasets/09-September", "Datasets/10-October.csv", "Datasets/11-November.csv", "Datasets/12-December.csv"};
        int i = 0;
        while(i<12){
            MyThread t = new MyThread(fileNames[i]);
            t.run();
            i++;
        }
    }
}
