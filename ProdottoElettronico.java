public ProdottoElettronico(String nome, double prezzoBase, boolean garanzia) {
    super(nome, prezzoBase);
    this.garanzia = garanzia;
}

@Override
public double calcolaPrezzoFinale() {
    if (garanzia) {
        return prezzoBase * 1.10; 
    }
    return prezzoBase;
}
