package padraoFlyweight;

public class Bairro {

    private String nome;
    private String cep;

    public Bairro(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }
}
