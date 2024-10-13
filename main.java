
public class main {
    public static void main(String[] args) {
        
   

        gerenciadorDePessoa gerenciador = new gerenciadorDePessoa();
       

        pessoa pessoa1 = new pessoa("Thiago", "143.256.989-00", 30);
        gerenciador.cadastrarPessoa1(pessoa1);

        
        pessoa pessoa2 = new pessoa("Romario", "124.232.333-00", 25);
        gerenciador.cadastrarPessoa2(pessoa2);

        
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        
        pessoa novaPessoa1 = new pessoa("Alana Vitoria", "145.711.191-90", 31);
        gerenciador.atualizarPessoa1(novaPessoa1);

      
        System.out.println("\nApós a atualização:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();


    }

}
