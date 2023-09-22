import java.io.IOException;
import java.io.File;

public class PR121Files {
    public static void main(String[] args) throws InterruptedException, IOException {

        String fileList = "The files in the directory are:\n";

        try {

            File dir = new File("./src/myFiles");
            File file1 = new File("./src/myFiles/file1.txt");
            File file2 = new File("./src/myFiles/file2.txt");

            // create directory ("myFiles")
            if (!dir.isDirectory()) dir.mkdir();

            // create two files ("file1.txt" & "file2.txt")
            if (dir.isDirectory()){ 
                file1.createNewFile();
                file2.createNewFile();
            } else throw new IOException();

            // rename "file2.txt" to "renamedFile.txt"
            file2.renameTo(new File("./src/myFiles/renamedFile.txt"));

            // Show a list of myFiles after the misage "The files in the directory are:"
            for (String fileString : dir.list()) { 
                fileList += " - " + fileString + "\n";
            } 
            System.out.println(fileList);
            fileList = "The files in the directory are:\n";
            
            // Delete the file "file1.txt"
            file1.delete();

            // Show again a list of myFiles after the misage "The files in the directory are:"
            for (String fileString : dir.list()) { 
            fileList += " - " + fileString + "\n";
            } 
            System.out.println(fileList);
            fileList = "The files in the directory are:\n";

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
