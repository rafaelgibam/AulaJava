
package Produtos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

   
    public static void main(String[] args) {
        
        ArrayList <Produto> listaProd = new ArrayList <Produto>();
        String nome;
        int resp, cod;
        
        Produto prod; 
       
        
        do{
           cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do Produto:"));
           nome = JOptionPane.showInputDialog(null,"Digite o nome do Produto:");
        
           prod = new Produto(cod,nome);
           listaProd.add(prod);
           resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja cadastra mais produtos? Sim = 1 / Não = 0"));
           
        }while(resp == 1);
        
        for(int i = 0 ; i < listaProd.size() ; i++){
            
            prod = listaProd.get(i);
            System.out.println(
                
                "Codigo: " + prod.cod + "\n" +
                "Nome: " + prod.nome +"\n"
                    
            );
            
        }
        
       
    }
    
}
