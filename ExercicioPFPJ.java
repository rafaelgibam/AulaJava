package exerciciopfpj;


import javax.swing.JOptionPane;

public class ExercicioPFPJ {

    public static void main(String[] args) {
        
        PF vpf[];
        PJ vpj[];
        
        vpf = new PF[5];
        vpj = new PJ[5];
        
        for(int i = 0 ; i < 2 ; i++){
            
            long cpf;
            String nome;
           
            nome = JOptionPane.showInputDialog(null,"Qual seu nome? ");
            cpf = Long.parseLong(JOptionPane.showInputDialog(null,"Digite seu CPF: "));

            PF pf = new PF(cpf,nome);
            pf.nome = nome;
            pf.cpf = cpf;
            pf.nasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Data de nascimento: " ));
            pf.endr = JOptionPane.showInputDialog(null,"Onde você mora?");
            pf.email = JOptionPane.showInputDialog(null,"Qual seu e-mail?");
            pf.rg = Long.parseLong(JOptionPane.showInputDialog(null,"Digite seu RG:s"));
            
            vpf[i] = pf;
            
        }
         
        for (int i = 0 ; i < 2 ; i++){
            
            System.out.println(
                    
                "Nome: " + vpf[i].nome + "\n" +
                "Cpf: " + vpf[i].cpf + "\n" +
                "Rg: " + vpf[i].rg + "\n" +
                "Nascimento: " + vpf[i].nasc + "\n" +
                "E-Mail: " + vpf[i].email + "\n" 
            );
            
            
        }
        
   }
    
}
