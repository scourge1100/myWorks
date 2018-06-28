import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	int number;
	List<Set> list;
	List<Set> tempStorage;

	void genAuto() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 개수 : ");
		int row = scan.nextInt();
		
		this.tempStorage.clear();
				
		for (int i = 0; i < row; i++) {
			Set<Integer> nums = new LinkedHashSet<>();
			while( nums.size() < this.number){
	            Double d = Math.random() * 45 + 1;
	            nums.add(d.intValue()); 
	        }
	        this.tempStorage.add(nums);			
		}
		
		System.out.println("1. Lotto 번호 자동 생성");
		print(this.tempStorage);
		save(this);
	}
	
	void genManual() {
		Scanner scan = new Scanner(System.in);
		this.tempStorage.clear();
		
		System.out.println("2. Lotto 번호 수동 생성");
		System.out.println("번호를 입력하세요(예 6 7 12 20 40 45)");
		System.out.println("단. 그만 입력하려면 -1을 입력하세요)");
		
		gen:while (true) {
			System.out.print(" > ");
			
			Set<Integer> nums = new LinkedHashSet<>();
			for (int i = 0; i < this.number; i++) {
				int num = scan.nextInt();
				if(num == -1) {
					break gen;
				}else{
					nums.add(num);
				}
			}
			this.tempStorage.add(nums);      
		}
		print(this.tempStorage);
		save(this);		
	}

	private void print(List<Set> list) {
		System.out.println("인덱스  로또번호");
		int index = 1;
		if( list.size() == 0 ) {
			System.out.println("로또 번호가 없습니다.");
		} else {
			for (Set set : list) {
				System.out.printf("%d | %s\n", index, set);
				index++;
			}			
		}
		
	}

	void save(Lotto lotto){
		
		final int SAVE = 1;
		final int EXIT = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 저장하기");
		System.out.println("2. 상위메뉴로 가기");
		System.out.print(" > ");
		int menu = scan.nextInt();
		switch (menu) {
		case SAVE:
			lotto.list.addAll(lotto.tempStorage);			
			break;
		case EXIT:
			break;
		default:
			break;
		}
	}
	
	void print() {
		System.out.println("인덱스  로또번호");
		int index = 1;
		if( list.size() == 0 ) {
			System.out.println("로또 번호가 없습니다.");
		} else {
			for (Set set : list) {
				System.out.printf("%d | %s\n", index, set);
				index++;
			
			}
		}		
	}
	
	
	
	static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lotto 관리 프로그램");
		System.out.println("1. 번호 자동 생성");
		System.out.println("2. 번호 수동 생성");
		System.out.println("3. 내 로또 번호 보기");
		System.out.println("4. 종료");
		System.out.print(" > ");
		
		return scan.nextInt();
	}
}

