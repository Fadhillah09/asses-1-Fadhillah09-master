import java.util.Scanner;
public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 5 nomor ID:");
        int[] ids = new int[5];
        for (int i = 0; i < 5; i++) {
            ids[i] = scanner.nextInt();
        }
        
        for (int id : ids) {
            if (isValidID(id)) {
                System.out.println(id + " Valid");
            } else {
                System.out.println(id + " Tidak valid");
            }
        }
    }
    public static boolean isValidID(int id) {
		if (id < 100 || id > 999) {
            return false;
        }
		int digit1 = id / 100;
        int digit2 = (id / 10) % 10;
        int digit3 = id % 10;

        if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
            return false;
        }
        if (digit1 > digit2) {
            return false;
        }
        if (digit3 % 2 == 0) {
            return false;
        }
        return true;
	}
}