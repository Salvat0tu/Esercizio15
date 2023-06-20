public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer( "Salvatore", 28, true);
        Programmer programmer2 = new Programmer( "Elisa" ,27, false);

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
