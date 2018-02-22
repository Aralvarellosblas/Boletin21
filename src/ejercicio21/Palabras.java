package ejercicio21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Palabras{

    private File fich;
    private PrintWriter escribir;
    private FileWriter fw;
    private ArrayList<String> p=new ArrayList();

    public void listaPalabras(){
        int c=Integer.parseInt(JOptionPane.showInputDialog("Numero de palabras"));
        int i=0;
        do{
            p.add(JOptionPane.showInputDialog("Intoduce la palabra "+(i+1)));
            i++;
        }while(i!=c);
    }

    public void ordenarLista(){
        Collections.sort(p);
        for(int i=0; i<p.size(); i++){
            System.out.println(p.get(i));
        }
    }

    public void escribirFicheiro(){
        fich=new File("palabras.txt");
        try{
            escribir=new PrintWriter(fich);
            for(int i=0; i<p.size(); i++){
                escribir.println((i+1)+" "+p.get(i));
            }
        }catch(FileNotFoundException ex){
            System.out.println("Erro 1 "+ex.getMessage());
        }finally{
            escribir.close();
        }
    }
}
