package scanToDo;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class scanToDo {

    int counter = 0;

    public int listAllFiles(String path, String[] extArr) {

        File root = new File(path);

        File file = new File("foo");

        if (!file.exists()) {
            System.out.println("a file or directory named" + path + " not exists");
            return counter;
        } else {

        }

        File[] list = root.listFiles();

        if (list != null) { // In case of access error, list is null
            for (File f : list) {
                if (f.isDirectory()) {
                    listAllFiles(f.getAbsolutePath(), extArr);
                } else {

                    for (String strExt : extArr) {
                        if (f.getAbsolutePath().endsWith((strExt))) {
                            int lineNum = 0;
                            try {
                                Scanner scanner = new Scanner(f);
                                while (scanner.hasNextLine()) {
                                    String line = scanner.nextLine();
                                    lineNum++;
                                    if (line.contains("TODO")) {
                                        System.out.println(f.getAbsoluteFile() + " -- Line number " + lineNum);
                                        counter++;
                                    }
                                }
                                scanner.close();
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
        return counter;
    }

}