public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public Produto(int id, String nome, double preco, int qtdEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void addEstoque(int qtd) {
        if (qtd >= 0) {
            this.qtdEmEstoque += qtd;
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior ou igual a zero.");
        }
    }

    public void vender(int qtd) {
        if (qtd > 0 && qtd <= qtdEmEstoque) {
            this.qtdEmEstoque -= qtd;
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    public double getValorTotal() {
        return preco * qtdEmEstoque;
    }
}
