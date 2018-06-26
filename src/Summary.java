import java.util.Scanner;

public class Summary {

	public static void main(String[] args) {
	int x =0;
	int y =0;
	int sum =0;
	boolean a = true;
	
	while(a) {
	System.out.println("합을 구하는 프로그램\n1. 값 입력.\n2. 결과 보기\n3. 도움말\n4. 종료\n선택>> ");
	Scanner scan = new Scanner(System.in);
	switch(scan.nextInt()) {
	case 1 :
		while(true) {
		System.out.println("값을 입력하십시오.");
		Scanner scan1 = new Scanner(System.in);
		x = scan1.nextInt();
		y = scan1.nextInt();
			System.out.println("(시작 sp 끝값)>" + x + " " + y);
			System.out.println("상위 메뉴로 이동(yes-1/재입력-2)");
			Scanner scan2 = new Scanner(System.in);
			int i = scan2.nextInt();
			if( i==1) 
				 break;
			else {
			}
		}
		break;
			
	case 2 :
		for( int sum1=x;sum1<y+1;sum1++) 
			sum = sum+sum1;
		
			System.out.println("[" + x + "]" +"부터" + "["+y+"]"+"까지의 합은 : " + "["+sum+"]"+"입니다.");
			System.out.println("상위 메뉴로 이동(yes-1)");
			Scanner scan3 = new Scanner(System.in);
			int j = scan3.nextInt();
			if( j==1) 
				break;
			
			//else {
				//System.out.println("잘못 입력 하셨습니다.");
			//}
	case 3:
		System.out.println("사용자가 입력한 두개의 값 사이의 수를 모두 더해주는 프로그램입니다.");
		System.out.println("상위 메뉴로 이동(yes-1)");
		Scanner scan4= new Scanner(System.in);
		int k= scan4.nextInt();
		if( k==1) 
			break;
		//else {
			//System.out.println("잘못 입력 하셨습니다.");
		//}
	case 4:
		a=false;
		System.out.println("종료합니다.");
		break;
		
		}
		}
}
}
			
		
	
	



