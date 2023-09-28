import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.*;

public class PR120ReadFile {
    public static void main(String[] args) throws InterruptedException, IOException {
        int linePosition = 1;
        File file = new File("./src/PR120ReadFile.java");
        Scanner sc;
        String line = "";

        try {
            sc = new Scanner(file);

            while(sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(linePosition + " - " + line);
                linePosition ++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}