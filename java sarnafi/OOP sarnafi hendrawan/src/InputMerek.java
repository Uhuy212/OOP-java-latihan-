import java.io.*;

public class InputMerek {
    public static void main(String[] args) throws IOException{
      BufferedReader input = new BufferedReader (
      new InputStreamReader(System.in));
      String merek;
      System.out.println("Masukan merek : ");
      merek = input.readLine();
      System.out.println("Merek motor ini adalah " +merek);
      
    }
    
}
