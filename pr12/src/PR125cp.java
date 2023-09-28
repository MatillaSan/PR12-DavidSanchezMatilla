import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PR125cp {
    
    public static void cp (String origin, String destini) {

        boolean checkPaths = true;

        try {

            File originFile = new File(origin);
            File destiniFile = new File(destini);
            
            if (!originFile.isFile() | originFile.isDirectory()) {
                checkPaths = false;
                System.out.println("The origin path dosn't exist!");
            }
            if (destiniFile.isFile() | destiniFile.isDirectory()) {
                checkPaths = false;
                System.out.println("The destini path already exist!");
            }

            if (checkPaths) {
                Scanner sc = new Scanner(originFile);
                String cp = "";

                while (sc.hasNextLine()) cp += sc.nextLine() + "\n";

                FileWriter wDestiniFile = new FileWriter(destiniFile);

                wDestiniFile.write(cp);

                sc.close();
                wDestiniFile.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
