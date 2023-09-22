import java.io.File;
import java.util.Scanner;

public class PR122cat {
    static void cat(String fileString) {

        try {

            File file = new File(fileString);
            int lineCount = 1;

            if (file.isFile()) {// Check if the rute is correct
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    System.out.println(lineCount + " - " + sc.nextLine());
                    lineCount ++;
                }

                sc.close();
                
            } else if (file.isDirectory()) System.out.println("The path is from a directory, need to be a file.");
            else System.out.println("The file dosn't exist.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}