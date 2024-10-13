
public class main {
    public static void main(String[] args) {
        
   

        gerenciadorDePessoa gerenciador = new gerenciadorDePessoa();
       

        pessoa pessoa1 = new pessoa("Amanda", "777.876.876-00", 30);
        gerenciador.cadastrarPessoa1(pessoa1);

        
        pessoa pessoa2 = new pessoa("maria", "124.123.123-00", 25);
        gerenciador.cadastrarPessoa2(pessoa2);

        
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        
        pessoa novaPessoa1 = new pessoa("charles gomes", "333.123.123-10", 31);
        gerenciador.atualizarPessoa1(novaPessoa1);

      
        System.out.println("\nApós a atualização:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();


    }

}
