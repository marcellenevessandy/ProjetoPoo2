package br.ulbra.poo;

/**
 *
 * @author aluno.saolucas
 */
public class Conta {
    
    private String nomeCliente;
    private int numConta;
    private double saldo;

    // metodo modificador no privado ultilizamos SET
    public void setNomeCliente (String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public void setSaldo (double saldo) {
    this.saldo = saldo;
    }
    public String getNomeCliente (){
    return nomeCliente;
    }
    public int getNumConta (){
    return numConta;
    }
    public double getSaldo (){
    return saldo;
    }
    
}
