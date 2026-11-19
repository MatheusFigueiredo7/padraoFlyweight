package padraoFlyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CentroDistribuicaoTest {

    @Test
    void deveRetornarPedidos() {
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao();
        centroDistribuicao.registrarPedido("Jose", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Maria", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Ana", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Joao", "Barreiro", "36015-000");

        List<String> saida = Arrays.asList(
                "Pedido{cliente='Jose', bairro='Centro', cep='36000-000'}",
                "Pedido{cliente='Maria', bairro='Centro', cep='36000-000'}",
                "Pedido{cliente='Ana', bairro='Centro', cep='36000-000'}",
                "Pedido{cliente='Joao', bairro='Barreiro', cep='36015-000'}");

        assertEquals(saida, centroDistribuicao.obterPedidos());
    }

    @Test
    void deveRetornarTotalBairros() {
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao();
        centroDistribuicao.registrarPedido("Jose", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Maria", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Ana", "Centro", "36000-000");
        centroDistribuicao.registrarPedido("Joao", "Barreiro", "36015-000");

        assertEquals(2, BairroFactory.getTotalBairros());
    }
}
