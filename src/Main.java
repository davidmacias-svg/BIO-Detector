import java.util.Scanner;


public class Main {	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		Ask(in);
		Ask2(in);
	}
	
	public static int add( int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10, int num11, int num12, int num13, int num14, int num15, int num16, int num17, int num18, int num19, int num20, int num21, int num22, int num23) {
		if (num8 > 2) {
			return 8;
		} else if (num9 > 2) {
			return 2;
		} else if (num21 > 2) {
			return 21;
		} else  if (num18 > 2) {
			return 18;
		} else if (num13 > 2) {
			return 13;
		} else if (num1 > 2 || num1 < 2 || num2 > 2 || num2 < 2 || num3 > 2 || num3 < 2 || num4 > 2 || num4 < 2 || num5 > 2 || num5 < 2 || num6 > 2 || num6 < 2 || num7 > 2 || num7 < 2 || num10 > 2 || num10 < 2 || num11 > 2 || num11 < 2 || num12 > 2 || num12 < 2 || num14 > 2 || num14 < 2 || num15 > 2 || num15 < 2 || num16 > 2 || num16 < 2 || num17 > 2 || num17 < 2 || num19 > 2 || num19 < 2 || num20 > 2 || num20 < 2|| num22 > 2 || num22 < 2 ) {
			return 100;
		}
		return 0;
	}
	
	public static int Sex(char sexual1, char sexual2, char sexual3, char sexual4, char sexual5) {
		if ((sexual1 == 'X') && (sexual2 == 'X') && (sexual3 != 'Y') && (sexual3 != 'X')) {
			return 1;
		} else if ((sexual1 == 'X') && (sexual2 == 'Y') && (sexual3 != 'Y') && (sexual3 != 'X')) {
			return 2;
		} else if ((sexual1 == 'X') && (sexual2 == 'X') && (sexual3 == 'X') && (sexual4 != 'Y') && (sexual4 != 'X')) {
			return 3;
		} else if ((sexual1 == 'X') && (sexual2 == 'X') && (sexual3 == 'Y') && (sexual4 != 'Y') && (sexual4 != 'X')) {
			return 4;
		} else if ((sexual1 == 'X') && (sexual2 == 'X') && (sexual3 == 'X') && (sexual4 == 'X') && (sexual5 != 'Y') && (sexual5 != 'X')) {
			return 5;
		} else if ((sexual1 == 'X') && (sexual2 == 'X') && (sexual3 == 'X') && (sexual4 == 'X') && (sexual5 == 'X')) {
			return 6;
		} else if ((sexual1 == 'X') && (sexual2 == 'Y') && (sexual3 == 'Y') && (sexual4 != 'Y') && (sexual4 != 'X')) {
			return 7;
		} else if ((sexual1 == 'X') && (sexual2 != 'X') && (sexual2 != 'Y')) {
			return 8;
		} 
		return 0;
	}
	
	public static void Ask(Scanner in) {
		
		System.out.println("How many Kariotypes are in the analysis");
		int k1 = Integer.parseInt(in.nextLine());
		int [] kariotype = new int[23];
		for (int i = 0; i < kariotype.length; i++) {
			kariotype [i] = Integer.parseInt(in.nextLine());
		}
		if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 8){
			System.out.println("Warkany syndrome 2 IDENTIFIED");
		} else if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 9){
			System.out.println("Mosaic Trisomy 9 IDENTIFIED");
		} else if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 21){
			System.out.println("Down syndrome IDENTIFIED");
		} else if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 18){
			System.out.println("Edwards syndrome IDENTIFIED");
		} else if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 13){
			System.out.println("Patau syndrome IDENTIFIED");
		} else if (add(kariotype [0], kariotype [1], kariotype [2], kariotype [3], kariotype [4], kariotype [5], kariotype [6], kariotype [7], kariotype [8], kariotype [9], kariotype [10], kariotype [11], kariotype [12], kariotype [13], kariotype [14], kariotype [15], kariotype [16], kariotype [17], kariotype [18], kariotype [19], kariotype [20], kariotype [21], kariotype [22]) == 100){
			System.out.println("A lethal anomaly was detected in the genome");
		} else {
			System.out.println("Autosomal chromosomes fulfill the structure necessary for health");
		}
		return;
	} 
	
	public static void Ask2(Scanner in) {
				
		System.out.println("How many Sexual Chromosomes are in the analysis in orden type '.' if the spots are blank");
		char [] Sexual = new char[5];
		for (int w = 0; w < Sexual.length; w++) {
			Sexual [w] = in.nextLine().charAt(0);
		}
		
		if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 1) {
			System.out.println("Normal Healthy Female");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 2) {
			System.out.println("Normal Healthy male");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 3) {
			System.out.println("Triple X Syndrome female IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 4) {
			System.out.println("Klinefelter Syndrome male IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 5) {
			System.out.println("Tetrasomy X female IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 6) {
			System.out.println("Pentasomy X female IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 7) {
			System.out.println("Jacobs' Supermale Syndrome male IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 7) {
			System.out.println("Turner Syndrome male IDENTIFIED");
		} else if (Sex(Sexual[0], Sexual[1], Sexual[2], Sexual[3], Sexual[4]) == 0) {
			System.out.println("A lethal anomaly was detected in the genome");
		}
		return;
	}


}
