package br.com.banco.main;
import br.com.banco.model.Agencia;
import br.com.banco.model.Cliente;
import br.com.banco.model.ContaBancaria;
public class MainTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("123.456.789-00", "João Silva", "joao@email.com");
        Cliente c2 = new Cliente("123.456.789-00", "João Pedro", "outro@email.com");
    
    if (c1.equals(c2)) {
            System.out.println("RN02 Validada: Clientes com o mesmo CPF sao iguais.");
        } else {
            System.out.println("Falha na RN02!");
        }
ContaBancaria conta = new ContaBancaria("0001", c1, 50.0);
boolean resultadoSaque = conta.sacar(50.0);
        System.out.println("Resultado do saque de R$ 50.0: " + resultadoSaque);
        System.out.println("Total de contas abertas: " + Agencia.getTotalContasAbertas());
    }

}
