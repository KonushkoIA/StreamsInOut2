import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextCheck {

    private static int numberOfCoincidences = 0;

   public static boolean checkCensor(String line) {
       boolean flag = true;
       try ( BufferedReader bufferedReader2 = new BufferedReader(new FileReader("censor.txt"))) {
           String line1;
           while ((line1 = bufferedReader2.readLine()) != null) {
               line1 = line1.trim();
               String[] data = line1.split(" ");
               for (String a : data) {
                   if (a.equals(line)) {
                       numberOfCoincidences++;
                       System.out.println("Слово ( " + line + " ) подлежит исправлению");
                       flag = false;
                   }
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       return flag;
   }

    public static int getNumberOfCoincidences() {
        return numberOfCoincidences;
    }
}
