package padraoFlyweight;

public class Pedido {

    private String cliente;
    private Bairro bairro;

    public Pedido(String cliente, Bairro bairro) {
        this.cliente = cliente;
        this.bairro = bairro;
    }

    public String obterPedido() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", bairro='" + bairro.getNome() + '\'' +
                ", cep='" + bairro.getCep() + '\'' +
                '}';
    }
}
