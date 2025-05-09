public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile {
    protected int durata;
    protected int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }
}
