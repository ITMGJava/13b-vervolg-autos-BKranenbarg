public class testAuto {
    public static void main(String[] args) {


        Auto auto1 = new Auto("Toyota");
        System.out.println(auto1.getSnelheid());
        System.out.println(auto1.getMerk());
        System.out.println(auto1.getKilometerstand());

        System.out.println(Auto.motorgegevens());


        Auto tesla = new Auto("Tesla");
        System.out.println(tesla.getMerk());
        System.out.println(tesla.getSnelheid());
        System.out.println(tesla.getKilometerstand());

        System.out.println(Auto.motorgegevens());

    }



}
