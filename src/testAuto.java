public class testAuto {
    public static void main(String[] args) {


        Auto auto1 = new Auto("Toyota", 5000);
        System.out.println(auto1.getSnelheid());
        System.out.println(auto1.getMerk());
        System.out.println(auto1.getKilometerstand());

        System.out.println(auto1.motorgegevens());


        Auto tesla = new Auto("Tesla", 2500);
        System.out.println(tesla.getMerk());
        System.out.println(tesla.getSnelheid());
        System.out.println(tesla.getKilometerstand());

        System.out.println(tesla.motorgegevens());

        System.out.println(Auto.motorgegevens());

    }



}
