package list.operacoes_basicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List <Item> itemList;
    
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quant) {
        itemList.add(new Item(nome, preco, quant));
    }
    public void removerItem(String nome) {
        Iterator<Item> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove();
                break;
            }
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuant();
        }
        return valorTotal;
    }
    public void exibirItens() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Produto 1", 10.0, 2);
        carrinho.adicionarItem("Produto 2", 15.0, 1);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Produto 1");

        System.out.println("Itens no carrinho após a remoção:");
        carrinho.exibirItens();

        System.out.println("Novo valor total: " + carrinho.calcularValorTotal());
    }
}