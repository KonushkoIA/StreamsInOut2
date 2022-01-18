import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader("text1.txt"))) {
            String line;
            boolean check = true;
            while ((line = bufferedReader1.readLine()) != null) {
                line = line.trim();
                check = TextCheck.checkCensor(line);
            } if (check) {
                System.out.println("Текст прошёл проверку на цензуру");
            } else {
                System.out.println("Текст не прошёл проверку на цензуру");
                int numberOfFixes = TextCheck.getNumberOfCoincidences();
                System.out.println("Количество необходимых исправлений : " + numberOfFixes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
