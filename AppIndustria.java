import java.io.PrintStream;
import java.util.Scanner;

public class AppIndustria {
    /*
     * Uma indústria de manufatura deseja desenvolver um sistema de controle de
     * produção para gerenciar a fabricação de seus produtos. O sistema deve
     * permitir que os funcionários da indústria cadastrem novos produtos,
     * acompanhem o status de produção e realizem a contagem regressiva para o prazo
     * de entrega de cada pedido.
     * 
     * 1. Cadastrar novo produto: O sistema deve permitir que os funcionários da
     * indústria cadastrem novos produtos, informando o nome do produto, código de
     * identificação, quantidade a ser produzida e prazo de entrega. PUBLIC
     * 
     * 2. Acompanhar o status de produção: O sistema deve exibir o status de
     * produção de cada produto, mostrando a quantidade produzida até o momento e a
     * quantidade restante para atingir a meta estabelecida. PRIVATE
     * 
     * 3. Verificar prazo de entrega: O sistema deve verificar se o prazo de entrega
     * de cada pedido foi cumprido. Caso o prazo seja atingido, o produto é
     * considerado pronto para entrega.
     * 
     * 4. Modificadores de acesso: As informações sobre o status de produção de cada
     * produto devem ser armazenadas de forma privada, e o sistema deve utilizar
     * modificadores de acesso adequados (public, private e protected) para
     * controlar a visibilidade e o acesso aos atributos e métodos da classe.
     * 
     * 5. Entrada e saída de dados: O sistema deve permitir a entrada de dados do
     * usuário para cadastrar novos produtos e exibir mensagens formatadas no
     * console para informar o status de produção e o prazo de entrega
     * 
     */
    public static void main(String[] Controle) {
        Menu.menu();

    }

}

class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Acompanhar o status de produção");
        System.out.println("3 - Verificar prazo de entrega");
        System.out.println("4 - Modificadores de acesso");
        System.out.println("5 - Entrada e saída de dados");
        Integer opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(
                        "Cadastre seu produto, informe o nome do produto, código de identificação, quantidade a ser produzida e prazo de entrega.");

                Produto.cadastrarProduto(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
                break;
            case 2:
                System.out.println("Acompanhar o status de produção");
                break;
            case 3:
                System.out.println("Verificar prazo de entrega");
                break;
            case 4:
                System.out.println("Modificadores de acesso");
                break;
            case 5:
                System.out.println("Entrada e saída de dados");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}

class Produto {
    // Scanner
    static Scanner scanner = new Scanner(System.in);
    // Atributos
    public String nomeProduto;
    public Integer codigoProduto;
    public Integer quantidadeProduto;
    public String prazoProduto;

    // Construtor
    public Produto(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto, String prazoProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.prazoProduto = prazoProduto;
    }

    public static Produto criarProduto(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto,
            String prazoProduto) {
        return new Produto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
    }

    // Métodos
    public static void cadastrarProduto(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto,
            String prazoProduto) {
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Código de identificação: " + codigoProduto);
        System.out.println("Quantidade a ser produzida: " + quantidadeProduto);
        System.out.println("Prazo de entrega: " + prazoProduto);
        Produto produto = new Produto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }
}
