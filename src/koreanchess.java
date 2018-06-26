import java.util.Scanner;

public class koreanchess {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean i = true;
		char[][] buff = new char[y][x];
		System.out.println("오목게임입니다.");
			char[][] board = new char[10][15];
			for (y = 0; y < 10; y++)
				for (x = 0; x < 15; x++)
					board[y][x] = '┼';

			for (y = 0; y < 10; y++) {
				for (x = 0; x < 15; x++)
					System.out.printf("%c", board[y][x]);
				System.out.println();
			}
			while (i) {
				Scanner scan = new Scanner(System.in);
				System.out.println("1. 플레이어(1)\n2. 플레이어(2)\n3.기권\n입력하세요 >>>");
				switch (scan.nextInt()) {
				case 1:
					System.out.println("원하는 위치를 입력하세요.");
					int stone1 = scan.nextInt() - 1;
					int stone2 = scan.nextInt() - 1;
					board[stone2][stone1] = '○';
					for (y = 0; y < 10; y++) {
						for (x = 0; x < 15; x++)
							System.out.printf("%c", board[y][x]);
						System.out.println();
					}
					break;
				case 2:
					System.out.println("원하는 위치를 입력하세요.");
					int stone3 = scan.nextInt() - 1;
					int stone4 = scan.nextInt() - 1;
					board[stone4][stone3] = '●';
					for (y = 0; y < 10; y++) {
						for (x = 0; x < 15; x++)
							System.out.printf("%c", board[y][x]);
						System.out.println();
					}
					break;
				case 3:
					System.out.println("게임을 종료 합니다.");
					i = false;
				}
			}
		}
	}
