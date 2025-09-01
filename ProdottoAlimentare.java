public class ProdottoAlimentare extends Prodotto {

    private int giorniAllaScadenza;

    public ProdottoAlimentare(String nome, double prezzoBase, int giorniAllaScadenza) {
        super(nome, prezzoBase);
        this.giorniAllaScadenza = giorniAllaScadenza;
    }

    @Override
    public double calcolaPrezzoFinale() {
        if (giorniAllaScadenza <= 3) {
            return getPrezzoBase() * 0.8; // sconto 20%
        }
        return getPrezzoBase();
    }
}


