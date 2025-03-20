package es.examen.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerFichero {

    public static void main(String[] args) {
        
        LeerFichero leerFichero = new LeerFichero();
        leerFichero.leerArchivo("C:\\Users\\Tardes\\Desktop\\ExamenFichero\\FicheroEjercicio2.txt");
    }

    public int leerArchivo(String nombre) {
		Path path = Paths.get(nombre);
		int contador = 0;
        int contadorPalabras = 0;
        try{
            
		    List<String> lines = Files.readAllLines(path);
            for (String linea : lines) {
                contador++;
                String [] palabras = linea.split(" ");
                
                for (String palabra : palabras) {
                    if (palabra.toLowerCase().contains("java")){
                        contadorPalabras++;
                    }    
                }
                
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
		

		System.out.println("Num lineas: "+contador);
        System.out.println("Num palabras encontradas (JAVA): "+contadorPalabras);
        return contador;
	
    }

}
