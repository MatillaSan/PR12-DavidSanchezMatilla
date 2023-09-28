import java.io.File;
import java.io.FileWriter;

public class PR123append {
    public static void main(String[] args) {

        try {

                File file = new File("./src/myFiles/frasesMatrix.txt");
                FileWriter writeFile = new FileWriter(file, true);

                writeFile.write("Yo sólo puedo mostrarte la puerta\n");
                writeFile.write("Tú eres quien la tiene que atravesar\n");
                writeFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
