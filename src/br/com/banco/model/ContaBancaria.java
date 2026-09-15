package br.com.banco.model;

public class ContaBancaria {
private String numeroConta;
private Double saldo;
private Cliente titular;
public ContaBancaria(String numeroConta, Cliente titular , Double saldo) {
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
    Agencia.registrarNovaConta();
}
public String getNumeroConta() {
    return numeroConta;
}
public Double getSaldo() {
    return saldo;
}
public Cliente getTitular() {
    return titular;
}
public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    public boolean sacar(double valor) {
        double valorTotal = valor + Agencia.TAXA_SAQUE;
        
        if (this.saldo >= valorTotal) {
            this.saldo -= valorTotal;
            return true;
        }
        
        return false;
    }
}
