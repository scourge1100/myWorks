import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		//------------------------- 10번 반복 -> 0~9,   1~10
		/*for(int y=1; y<=10; y++)
		{
			for(int x=1; x<=15; x++)
				if(x == 2)
					System.out.printf("%c", '○');
				else if(x == 5)
					System.out.printf("%c", '☆');
				else
					System.out.printf("%c", '┼');
			
			System.out.println();
		}*/
		//------------------------
		
		/*		 		 
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
		 ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼				 
		 */
		
		//-- 오목판 생성 ---------------------------------
		//char[] board = new char[10*15];
		char[][] board = new char[10][15];
		
		//-- 오목판 초기화 -------------------------------
		/*for(int i=0; i<10*15; i++)
			board[i] = '┼';*/
		for(int y=0; y<10; y++)		
			for(int x=0; x<15; x++)
				board[y][x] = '┼';
		
		//-- 오목판 출력
		for(int y=0; y<10; y++)
		{
			for(int x=0; x<15; x++)
				//System.out.printf("%c", board[15*y+x]); // 0,1,2,3,4,.......149
				System.out.printf("%c", board[y][x]); // 0,1,2,3,4,.......149
			
			System.out.println();
		}
		
		// 마음에 들 때까지 오목판을 수정할 수 있다.
		
		
		// 3*4 (m(↓) by n(→) matrix)위치에 흰돌('○')을 두시오.
		int ox = 4-1;
		int oy = 3-1;
		//board[15*oy+ox] = '○';
		board[oy][ox] = '○';
		
		// 사용자에게 (x sp y) : 3 7_ 형식으로 오목 위치를 입력 받아서 그 위치에 오목을 두시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("(x sp y) :");
		
		ox = scan.nextInt();
		oy = scan.nextInt();
		board[oy-1][ox-1] = '●';
		
		//-- 오목판 출력
		for(int y=0; y<10; y++)
		{
			for(int x=0; x<15; x++)
				//System.out.printf("%c", board[15*y+x]); // 0,1,2,3,4,.......149
				System.out.printf("%c", board[y][x]); // 0,1,2,3,4,.......149
			
			System.out.println();
		}
	}

}