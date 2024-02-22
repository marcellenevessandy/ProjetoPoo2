package br.ulbra.poo;

/**
 *
 * @author aluno.saolucas
 */
public class Aula {
    public static void main(String[] args) {
      Conta c1 = new Conta();
      c1.setNomeCliente("xiruzão");
      c1.setNumConta(123);
      c1.setSaldo(1000);
          
        System.out.println("Cliente Registrado!");
        System.out.println("Número da conta: " + c1.getNumConta());
        System.out.println("Nome do cliente: " + c1.getNomeCliente());
        System.out.println("Saldo: R$ " + c1.getSaldo());
    }
}
