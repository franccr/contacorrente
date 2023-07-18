package contacorrente;

public class Conta {
    private String nome;
    private String tipoConta;
    private double saldo;

    public void Conta(String nome, String tipoConta, double saldo){
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    void imprimi(){
        String mensagem = """
                  ****************************
                   Dados iniciais do cliente:
                   
                   Nome: %s
                   Tipo conta: %s
                   Saldo inicial: R$ %.2f
                  ****************************
                """ .formatted(this.nome,this.tipoConta,this.saldo);

        System.out.println(mensagem);
    }

    void transferiValor(Double valor){
            this.saldo -= valor;
            System.out.println("Transição realizada com sucesso!");
    }

    void recebeValor(Double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor atual: R$ " + getSaldo());
    }

}