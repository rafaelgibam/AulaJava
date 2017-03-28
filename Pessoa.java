
package CadastroPessoas;

public class Pessoa {
    
    String nome, endereco;
    int dataNasc;
    long cpf;
    
    void status(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cpf: "+ this.cpf);
        System.out.println("Data Nascimento: " + this.dataNasc);
        System.out.println("Endereço: "+ this.endereco);
    }
    
}
