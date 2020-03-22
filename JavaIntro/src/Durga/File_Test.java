package Durga;

import java.io.File;

public class File_Test {

      public static void main(String[] args) throws Exception {

            String path = "C:\\Users\\faisa\\git\\JavaIntro\\JavaIntro\\src\\Durga\\";

            createFile(path, "test2.txt");

      }

      public static File createFile(String path, String name) throws Exception {

            File file = new File("name");
            String location = path;

            File.createTempFile(location, name);

            return file;
      }
}
