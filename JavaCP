
package CadastroPessoas;

import javax.swing.JOptionPane;

public class Principal {

   
    public static void main(String[] args) {
        
        
        Pessoa vp[];
        
        vp = new Pessoa[2];
        
        for(int i = 0 ; i < 2 ; i++){
            
            Pessoa p = new Pessoa();
            p.nome = JOptionPane.showInputDialog("Qual é seu nome? ");
            p.cpf = Long.parseLong(JOptionPane.showInputDialog("Diga-me seu Cpf: "));
            p.dataNasc = Integer.parseInt(JOptionPane.showInputDialog("Que ano você Nasceu?"));
            p.endereco = JOptionPane.showInputDialog("Onde você mora? ");
            
            vp[i] = p;
            JOptionPane.showMessageDialog(null,
                    
                    "Nome: "            +   vp[i].nome + "\n" + 
                    "Cpf: "             +   vp[i].cpf + "\n" +
                    "Data Nascimento: " +   vp[i].dataNasc + "\n" + 
                    "Endereço: "        +   vp[i].endereco
                    
            );
         
          
        }
    
    }
    
}
