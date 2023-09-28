import java.io.File;
import java.io.FileWriter;

public class PR123sobreescriu {
    
    public static void main(String[] args) {

        try {

            File createFile = new File("./src/myFiles/frasesMatrix.txt");
            FileWriter file = new FileWriter(createFile);
            file.write("Yo sólo puedo mostrarte la puerta\n");
            file.write("Tú eres quien la tiene que atravesar\n");
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
