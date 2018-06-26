import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class BitmapProgram {

	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("data/boracay.bmp");
		FileOutputStream fos = new FileOutputStream("data/clone.bmp");
		int newWidth = 600;
		int newHeight = 300;
		
		
	
		
		//크기를 1024 바이트를 담는 buf를 만들어줘야한다.
		
		
		
		
		byte[] buf=new byte[26];
		int size = fis.read(buf);
		int height =(buf[22]&0x000000ff)<<24
					| (buf[23]&0x000000ff)<<16
					| (buf[24]&0x000000ff)<<8
					| (buf[25]&0x000000ff);
		int width =(buf[18]&0x000000ff)<<24
					|(buf[19]&0x000000ff)<<16
					|(buf[20]&0x000000ff)<<8
					|(buf[21]&0x000000ff);
		int imageHeight = height&newHeight;
		int imageWidth = width&newWidth;
		byte[] bufferedImage= new byte[8];

		
		int size1 = (buf[5]&0x000000ff)<<24|
				(buf[4]&0x000000ff)<<16|
				(buf[3]&0x000000ff)<<8|
				(buf[2]&0x000000ff)<<0;
		
		System.out.printf("%d\n",size1);
		
		System.out.printf("file height : %d\nfile width : %d\n", height, width);
		System.out.printf("file height : %d\nfile width : %d\n", imageHeight, imageWidth);

		fos.write(bufferedImage, 0, size);
		fis.close();
		fos.close();
		/*byte buf [] = new byte [1024];
		int size =0;
		while((size = fis.read(buf))!= -1) {
		*/
	
		//fos.write(buf, 0, size);
		}
		/*Scanner fscan = new Scanner(fis);
		
		int x = fscan.nextInt();
		
		System.out.printf("x:%d\n",x);*/
	
	}
	


