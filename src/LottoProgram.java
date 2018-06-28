import java.util.ArrayList;
import java.util.Set;

public class LottoProgram {
	public void main(String[] args) {
		final int AUTO_ADD = 1;
		final int MANUAL_ADD = 2;
		final int PRINT = 3;
		final int EXIT = 4;
		int menu;
		
		Lotto lotto = new Lotto();
		lotto.number = 6;
		lotto.list = new ArrayList<Set>();
		lotto.tempStorage = new ArrayList<Set>();
		
		Menu:while(true) {
			menu = Lotto.inputMainMenu();		
			switch (menu) {
			case AUTO_ADD:			
				lotto.genAuto();
				break;
			case MANUAL_ADD:
				lotto.genManual();
				break;
			case PRINT:
				lotto.print();
				break;
			case EXIT:
				break Menu;
			default:
				break;
			}			
		}
	}

}
