import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadProgram {

	public static void main(String[] args) throws IOException{
		//단어를 입력받아서 문장을 찾기.
		FileInputStream fis = new FileInputStream("/Users/peterlee/HP.smi");
		System.out.println("문자를 입력하세요.");
		Scanner fscan = new Scanner(fis);
		Scanner fscan1 = new Scanner(System.in);
		String str = fscan1.nextLine();
		while(fscan.hasNextLine()) {
			String line = fscan.nextLine();
				if(line.contains(str)) {
					
					String line1 = line.replaceAll("<br>","");
					System.out.println(line1);
				}
		}
		
		fscan.close();
		fis.close();
	}
}
//