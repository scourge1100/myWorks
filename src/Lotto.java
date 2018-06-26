import java.util.Scanner;

public class Lotto {
	static int a=0;
	static int [][] array = new int [3][6];
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		
		System.out.println("Lotto 관리 프로그램");
		System.out.println("1. 번호 자동 생성");
		System.out.println("2. 번호 수동 생성");
		System.out.println("3. 내 로또 번호 보기");
		System.out.println("4. 종료");
		System.out.println(">>>");
		
		int Lotto = scan.nextInt();
		switch(Lotto) {
		case 1:
			createAutoNum();
			break;
		case 2:
			createManualNum();
			break;
		case 3:
			listMyLotto();
			break;
		case 4:
			exit();
			break;
		}
	}
		

	private static void exit() {
	
		
	}

	private static void listMyLotto() {
	show();
		if(scan.nextInt() == 1)
		{
			mainMenu();
		}
	}

	private static void createManualNum() {
		System.out.println("2. Lotto 번호 수동 생성.");
		show();
		menu();
	}

	private static void createAutoNum() {
		System.out.println("1. Lotto 번호 자동 생성.");
		show();
		menu();
	
		
	}


	private static void show() {
	
	}

	private static void menu() {
		
		int b = scan.nextInt();
		switch(b) {
		case 1:
			break;
		case 2:
			break;
		}
	}

}
