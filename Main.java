import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double n1, n2;
		int select;

		Scanner input = new Scanner(System.in);

		System.out.print("İlk sayıyı giriniz: ");
		n1 = input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		n2 = input.nextInt();

		System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
		System.out.println("Seçiminiz: ");
		select = input.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplama işleminin sonucu:" + (n1 + n2));
			break;
		case 2:
			System.out.println("Çıkarma işleminin sonucu:" + (n1 - n2));
			break;
		case 3:
			System.out.println("Çarpma işleminin sonucu:" + (n1 * n2));
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("! Math Error");
			} else {
				System.out.println("result : " + (n1 / n2));
			}
			break;
		default:
			System.out.println("Yanlış bir seçim yaptınız");
			break;
		}
	}
}
