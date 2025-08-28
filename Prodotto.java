public class Prodotto {
    private String nome;
    private double prezzoBase;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzoBase = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzoBase;
    }

    public void dettagliProdotto() {
        System.out.println("Nome: " + nome + ", Prezzo: " + prezzoBase + " euro");
    }

    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public void setPrezzo(double nuovoPrezzo) {
        this.prezzoBase = nuovoPrezzo;
    }

    
}