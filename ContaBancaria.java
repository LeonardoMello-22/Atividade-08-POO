public class ContaBancaria {
    private String nome;
    private String numero;
    private int saldo;
    public ContaBancaria(String nome, String numero, int saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
            return nome;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
            return numero;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public String toString(){
        return "Nome do titular:" + nome + "\n" +
               "Número do titular:" + numero + "\n" +
               "Saldo:" + saldo;

    }
 
    
}