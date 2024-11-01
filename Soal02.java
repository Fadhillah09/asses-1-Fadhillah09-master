import java.util.Scanner;
public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
		double[] ipk = getInputIPK(scanner);
        int eprt = getInputEprt(scanner);
        String hkiStatus = getInputHkiStatus(scanner);
        String intlCompetition = getInputIntlCompetition(scanner);

        if (isCumlaude(ipk, eprt, hkiStatus, intlCompetition)) {
            System.out.println("cumlaude");
        } else {
            System.out.println("Tidak cumlaude");
        }
    }

    public static double[] getInputIPK(Scanner scanner) {
        System.out.println("Masukkan dua nilai IPK:");
        double ipk1 = scanner.nextDouble();
        double ipk2 = scanner.nextDouble();
        return new double[]{ipk1, ipk2};
    }

    public static int getInputEprt(Scanner scanner) {
        System.out.println("Masukan nilai EPRT:");
        return scanner.nextInt();
    }
	
    public static String getInputHkiStatus(Scanner scanner) {
        System.out.println("");
        return scanner.next();
    }

    public static String getInputIntlCompetition(Scanner scanner) {
        System.out.println("");

        return scanner.next();
    }

    public static boolean isCumlaude(double[] ipk, int eprt, String hkiStatus, String intlCompetition) {
        boolean meetsIpkRequirement = ipk[0] >= 3.5 || ipk[1] >= 3.5;
        boolean meetsEprtRequirement = eprt >= 450;
        boolean meetsHkiRequirement = hkiStatus.equalsIgnoreCase("ada");
        boolean meetsIntlCompetitionRequirement = intlCompetition.equalsIgnoreCase("ada");
        return meetsIpkRequirement && meetsEprtRequirement && meetsHkiRequirement && meetsIntlCompetitionRequirement;
    }
}