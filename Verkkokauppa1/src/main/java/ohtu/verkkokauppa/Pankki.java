package ohtu.verkkokauppa;

public class Pankki implements Pnkki {

    /*private static Pankki instanssi;

    public static Pankki getInstance() {
        if (instanssi == null) {
            instanssi = new Pankki();
        }

        return instanssi;
    }*/
    private Kpito kirjanpito;

    public Pankki(Kpito krjnpto) {
        kirjanpito = krjnpto;
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
