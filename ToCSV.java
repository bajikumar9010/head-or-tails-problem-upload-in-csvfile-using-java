import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;  

public class ToCSV {
    public static void main(String[] args) {
        
    
ArrayList<String>p1=new ArrayList<>();
    ArrayList<String>p2=new ArrayList<>();
    ArrayList<String>r=new ArrayList<>();
    Random random=new Random();
    int p1head=0;
    int p1tail=0;
    int p2head=0;
    int p2tail=0;
    for(int i=0;i<10;i++)
    {
        r.add("round"+i);
        int x = random.nextInt(2);   
        if(x==1)
        {
            p1.add("head");
            p1head++;
        }
        else
        {
            p1.add("tail");
            p1tail++;
        }
        if(x==0)
        {
            p2.add("head");
            p2head++;
        }
        else
        {
            p2.add("tail");
            p2tail++;
        }
    }
    

    PrintWriter pw;
    try {
      pw = new PrintWriter(new File("F:\\java files\\test16.csv"));

      StringBuffer csvHeader = new StringBuffer("");
      StringBuffer csvData = new StringBuffer("");
      csvHeader.append("round ,player1,player2\n");

      // write header
      pw.write(csvHeader.toString());

      // write data
      for(int i=0;i<10;i++)
      {
        csvData.append(r.get(i));
        csvData.append(",");
       csvData.append(p1.get(i));
       csvData.append(" ,");
      csvData.append(p2.get(i));
      csvData.append("\n");
      }
       
   
      

      
      pw.write(csvData.toString());
      pw.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}