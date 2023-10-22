package list.design_patterns;

// Interface para as estratégias
interface PagamentoStrategy {
    void realizarPagamento(int valor);
}

// Implementações das estratégias
class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void realizarPagamento(int valor) {
        System.out.println("Pagamento com cartão de crédito: $" + valor);
    }
}

class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void realizarPagamento(int valor) {
        System.out.println("Pagamento com boleto bancário: $" + valor);
    }
}

// Classe que usa a estratégia
class Pedido {
    private PagamentoStrategy pagamentoStrategy;
    
    public Pedido(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }
    
    public void processarPedido(int valor) {
        pagamentoStrategy.realizarPagamento(valor);
    }
}

public class Strategy {
    public static void main(String[] args) {
        PagamentoStrategy pagamentoCartao = new PagamentoCartao();
        PagamentoStrategy pagamentoBoleto = new PagamentoBoleto();
        
        Pedido pedidoCartao = new Pedido(pagamentoCartao);
        Pedido pedidoBoleto = new Pedido(pagamentoBoleto);
        
        pedidoCartao.processarPedido(100);
        pedidoBoleto.processarPedido(150);
    }
}

