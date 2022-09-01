package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWtiterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной ";
        String s = "privet";


        try ( FileWriter writer = new FileWriter("test2.txt", true)) {
//            for (int i = 0; i < rubai.length(); i++) {){

//                writer.write(rubai.charAt(i));
//            }
            // writer.write(rubai);
            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
