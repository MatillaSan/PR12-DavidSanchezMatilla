import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class PR124linies {

    public static void main(String[] args) {

        try {

            File createFile = new File("./src/myFiles/numeros.txt");
            FileWriter file = new FileWriter(createFile);
            Random rand = new Random();

            for (int i = 0 ; i < 10 ; i++) {
                file.write(rand.nextInt(11) + "\n");
            }

            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
