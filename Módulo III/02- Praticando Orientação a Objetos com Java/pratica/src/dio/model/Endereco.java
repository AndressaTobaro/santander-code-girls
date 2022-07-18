package dio.model;

public class Endereco {

    public enum TipoEndereco{
        RESIDENCIAL,
        ENTREGA,
        TRABALHO}

    public String endereco;
    public String numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String estado;
    public String cep;



}
