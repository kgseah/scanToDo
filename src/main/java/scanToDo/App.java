package scanToDo;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        scanToDo scanToDo = new scanToDo();
        String[] extArr = {".js",".go"};
        
        System.out.println("------------------------------------");

        System.out.println("Scanning for below file type");
        for (String msgExt : extArr) {
            System.out.print(msgExt + " ");
        }
        System.out.println("\n------------------------------------");

        System.out.println("Enter the path to scan: ");
        Scanner scanner = new Scanner(System.in);
        String rootFolder = scanner.nextLine(); //"c:\\test\\";
        scanner.close();
        
        //Return the number of 
        int counter = scanToDo.listAllFiles(rootFolder,extArr); 

        System.out.println("------------------------------------");
        System.out.println(counter + " files under " + rootFolder);
        System.out.println("------------------------------------");
    }
}
