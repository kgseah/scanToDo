package scanToDo;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class scanToDo {

    int counter = 0;

    public int listAllFiles(String path, String[] extArr) {

        File root = new File(path);
        File[] list = root.listFiles();

        //Check if directory give exsist
        if (!root.exists()) {
            System.out.println(path + " -- directory not found");
            return counter;
        } else {          
            //Check if directory list is null
            if (list != null) {
                //scan thru all file and direcory.
                //if direcory self call method
                for (File f : list) {
                    if (f.isDirectory()) {
                        listAllFiles(f.getAbsolutePath(), extArr);
                    } else {
                        //if is a file, match the given extentsion
                        for (String strExt : extArr) {
                            if (f.getAbsolutePath().endsWith((strExt))) {
                                //line number to check the TODO
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

}