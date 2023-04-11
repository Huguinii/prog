package TerceraEvaluacion;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


/**
 * Write a description of class Lector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lector
{
    public static void main(String[]args){
        File file =new File("doc.txt");
        
        try(Scanner sc= new Scanner(file)){
            
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException f){
            System.out.println("Hubo un error: "+ f.getMessage());
        }
        catch(Exception e){
            System.out.println("Hubo un error: ");
            System.out.println(e.getMessage());
        }
    }
}
