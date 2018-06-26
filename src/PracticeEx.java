
public class PracticeEx {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		for(y=1;y<=10;y++) {
			for(x=1;x<=15;x++) {
				if(y<5||x==11-y)
					System.out.printf("%c",'○');
				else if(y<6||x==11+y)
					System.out.printf("%c",'○');
				else if(y==5)
					System.out.printf("%c",'○');
				else
					System.out.printf("%c",'┼');
			}
			System.out.println();
		}

	}

}
