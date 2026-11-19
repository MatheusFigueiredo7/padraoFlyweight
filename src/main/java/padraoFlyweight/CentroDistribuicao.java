package padraoFlyweight;

import java.util.ArrayList;
import java.util.List;

public class CentroDistribuicao {

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public void registrarPedido(String cliente, String nomeBairro, String cep) {
        Bairro bairro = BairroFactory.getBairro(nomeBairro, cep);
        Pedido pedido = new Pedido(cliente, bairro);
        pedidos.add(pedido);
    }

    public List<String> obterPedidos() {
        List<String> saida = new ArrayList<String>();
        for (Pedido pedido : this.pedidos) {
            saida.add(pedido.obterPedido());
        }
        return saida;
    }
}
