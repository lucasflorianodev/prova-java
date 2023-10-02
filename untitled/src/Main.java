public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Produto A", 10.0, 50);
        produto1.addEstoque(30);

        produto1.vender(20);

        double valorTotal = produto1.getValorTotal();
        System.out.println("Valor total do estoque: " + valorTotal);
    }
}