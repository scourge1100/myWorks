import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		int count =0;
		Scanner scan = new Scanner(System.in);
	//	오목판 돌쇠판 = new 오목판 생성();
		char[][]board =createBoard();
		printBoard(board);
		while(true) {
			System.out.println("원하는 위치를 입력 하세요 >>>");
		Map<String, Integer> Stone = inputStone(scan);
		count++;
		placeStoneOnBoard(board, Stone, count);
		printBoard(board);
	}
	}


	public static void placeStoneOnBoard(char[][] board, Map<String, Integer> Stone, int count) {
		
			if(count%2==1) {
				board[Stone.get("stone2")][Stone.get("stone1")] ='◦';
				
			}else {
				board[Stone.get("stone2")][Stone.get("stone1")] = '●';
						
			}
	}
	
	public static Map<String, Integer> inputStone(Scanner scan) {
	Map<String, Integer>Stone = new HashMap<String, Integer>();
		int stone1 = scan.nextInt()-1;
		int stone2 = scan.nextInt()-1;
		Stone.put("stone1", stone1);
		Stone.put("stone2", stone2);
		return Stone;
	}

	private static void printBoard(char[][] board) {
		for(int y=0; y<10; y++)
		{
			for(int x=0; x<15; x++)
				System.out.printf("%c", board[y][x]);
				System.out.println();
		}
	}
	private static char[][] createBoard() {
		char[][] board = new char[10][15];
		for(int y=0; y<10; y++)		
			for(int x=0; x<15; x++)
				board[y][x] = '┼';
		return board;
	}

}