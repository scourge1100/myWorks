
public class BitProgram {

	public static void main(String[] args) {
		int pos;
		int x;
		int y;
		int s;
		pos = (7<<8)|5;
		x=(pos^5)>>8;
		s=x<<8;
		y=pos^s;
		//y=pos&x;
		System.out.println(x);
		System.out.println(y);

	}

}
