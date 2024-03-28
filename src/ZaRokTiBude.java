import java.util.Scanner;
public class ZaRokTiBude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej jméno: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadej svůj věk: ");
        String vek = scanner.nextLine();
        int cisloveku = Integer.parseInt(vek);
        cisloveku = cisloveku +1;
        String Jmeno = jmeno;
        String Prijmeni = prijmeni;
        System.out.println(Jmeno + " " + Prijmeni);
        System.out.println("Za rok ti bude " + cisloveku + " let.");


    }
}