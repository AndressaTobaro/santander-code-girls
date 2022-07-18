package dio.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa { //exemplo herança

    public String numCartao;

    private List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }

        if(endereco.cep==null){
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
