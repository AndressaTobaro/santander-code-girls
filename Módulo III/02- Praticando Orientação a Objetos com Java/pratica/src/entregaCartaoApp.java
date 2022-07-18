import dio.model.Cliente;
import dio.model.Endereco;

import java.util.ArrayList;

public class entregaCartaoApp {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

//        if (cliente.enderecos == null){
//            cliente.enderecos = new ArrayList<Endereco>();
//        }

        try{
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }

//        cliente.adicionarEndereco(endereco); // getEndereco: garante que toda vez que entrar em endereco vai verificar se o atributo endereco é nulo, se não é nulo, adiciona um endereco
//        System.out.println("Endereço adicionado com sucesso!");
    }
}
