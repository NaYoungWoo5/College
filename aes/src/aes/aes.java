package aes;

import java.util.*;

public class aes {

	static int c = 0, RS = 0;
	static Double AE = 0.0, SD = 0.0;

	public static void Calculation() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Double V = 0.0, Z = 0.0;

			System.out.println("\n(Z) = (������ - ���) / ǥ������");
			System.out.print("������ �Է�: ");
			RS = sc.nextInt();
			System.out.print("��� �Է�: ");
			AE = sc.nextDouble();
			System.out.print("ǥ������ �Է�: ");
			SD = sc.nextDouble();

			V += (RS - AE) / SD;
			Z = (double) Math.round(V * 10000) / 10000;

			if (Z >= 1.76) {
				System.out.println("��1��ޡ� | Z ����: " + Z);
			} else if (Z < 1.76 && Z >= 1.23) {
				System.out.println("��2��ޡ� | Z ����: " + Z);
			} else if (Z < 1.23 && Z >= 0.74) {
				System.out.println("��3��ޡ� | Z ����: " + Z);
			} else if (Z < 0.74 && Z >= 0.26) {
				System.out.println("4��� | Z ����: " + Z);
			} else if (Z < 0.26 && Z >= -0.26) {
				System.out.println("5��� | Z ����: " + Z);
			} else if (Z < -0.26 && Z >= -0.74) {
				System.out.println("6��� | Z ����: " + Z);
			} else if (Z < -0.74 && Z >= -1.23) {
				System.out.println("7��� | Z ����: " + Z);
			} else if (Z < -1.23 && Z >= -1.76) {
				System.out.println("8��� | Z ����: " + Z);
			} else {
				System.out.println("9��� | Z ����: " + Z);
			}
		}
	}

	public static void Table() {
		System.out.println("\n��� | (Z)����");
		System.out.println("1 |  3.0 ~ 1.76");
		System.out.println("2 |  1.76 ~ 1.23");
		System.out.println("3 |  1.23 ~ 0.74");
		System.out.println("4 |  0.74 ~ 0.26");
		System.out.println("5 |  0.26 ~ -0.26");
		System.out.println("6 | -0.26 ~ -0.74");
		System.out.println("7 | -0.74 ~ -1.23");
		System.out.println("8 | -1.23 ~ -1.76");
		System.out.println("9 | -1.76 ~ -3.0");
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("�������� ������ ������� ������");
//			List();
			Table();
			Calculation();
		}
	}
}
