import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// can also be int y=1;y<=10;y++ the same form
		/*
		 * int x=0; int y=0; for(y=1; y<=10;y++) { for(x=1;x<=15;x++) {
		 * if(x==y||x==11-y||x==11+y||x==21-y) System.out.printf("%c",'○'); else
		 * if(y==5) System.out.printf("%c",'○'); else System.out.printf("%c",'┼');
		 */

		// System.out.println();
		int x = 0;
		int y = 0;
		// 오판 생
		char[][] board = new char[10][15];
		// 오판 초기
		System.out.println("원하는 위치를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int stone1 = scan.nextInt();
		int stone2 = scan.nextInt();
		board[stone1][stone2]='○';
		
		int a=4-1;
		int b=3-1;
		board[b][a]='○';
		
		for (y = 0; y < 10; y++) {
			for (x = 0; x < 15; x++) {
			board[y][x] = '┼';
			
			
			// 마음에 들때 까지 오목판을 수정할 수 있다.
			// 3*3위치에 동그라미를 두시오.
			
			
		}
		}
		// 오목판 출력
		for (y = 0; y < 10; y++) {
			for (x = 0; x < 15; x++)
					System.out.printf("%c", board[y][x]);
				}
			System.out.println();
		}
	}

