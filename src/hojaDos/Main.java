package hojaDos;
import java.util.*;
import java.io.*;

public class Main {
	static ClaseCalculadora c = new ClaseCalculadora();
    public static void main(String[] args) {
        readData();
    }
    private static void readData(){
        String data = "datos.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(data));
            String texto = br.readLine();
            while(texto != null) {
                texto = br.readLine();
                String se = c.remover(texto);
                Double res = c.evaluate(se);
                System.out.println("El resultado es  "+ res);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo de texto no encontrado");
            ex.printStackTrace();
        }
        catch(Exception ex) {
            System.out.println(" ");
            ex.printStackTrace();
        }
        finally {
            try {
                if(br != null) {
                    br.close();
                }
            }
            catch (Exception ex) {
                System.out.println("Error al cerrar el archivo de texto");
                ex.printStackTrace();
            }
        }
    }

}
