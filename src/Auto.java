public class Auto {
    private int snelheid;
    private int kilometerstand;
    private String merk;

    static String motor = "Motor: Colombo V12 580 pk 980 kilo 3,8 liter";

    public int getKilometerstand() {
        return kilometerstand;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public String getMerk() {
        return merk;
    }


    public Auto(String merk) {
        this.merk = merk;
        snelheid=0;
        kilometerstand=2000;
    }

    public static String motorgegevens() {

        return motor;


    }

}
