
package atividadeE2;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class ListaControles {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner cons=new Scanner(System.in);
        ArrayList<ControleRemoto> loja = new ArrayList<ControleRemoto>();
        ControleRemoto Crt;
        
        for (int i=0;i<3;i++)
        {
            Crt = new ControleRemoto("Azul", "Universal");
            Crt.setCarga(JOptionPane.showInputDialog("Carga do controle"));
            Crt.setnSerial(JOptionPane.showInputDialog("Serial do controle"));
            loja.add(Crt);
        } 
        
        System.out.println("tamanho " + loja.size());
        HashMap<Integer, ControleRemoto> mapa = new HashMap<Integer, ControleRemoto>();
        for (int i=0;i<loja.size();i++)
        {
            Crt=(ControleRemoto)loja.get(i);
            System.out.println("Numero do controle " + Crt.getnSerial());
            System.out.println("Cor do controle é " + Crt.getCor());
            System.out.println("A carga do controle é " + Crt.getCarga());
            mapa.put(i+1, loja.get(i));
        }
        
        ControleRemoto c = mapa.get("1");
    
       
            
    }
    
    
}
