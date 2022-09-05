package sandwichapp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class sandwichIO {
    private order ord;
    public static void writeOrderToFile(order ord){
        FileOutputStream fileStream=null;
        PrintWriter outFS=null;
        try{
        fileStream= new FileOutputStream("orderline.txt", true);
        outFS=new PrintWriter(fileStream);
        outFS.println(ord.OrderInfo());
        outFS.close();
        }
        catch(IOException e){
            System.out.println("error reading file");
        }
    }
}
