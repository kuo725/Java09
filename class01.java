class CRectangle1 {
	int width;
	int height;

	public CRectangle1(int w, int h) {
		width = w;
		height = h;
	}

	public CRectangle1()// 沒有引數的建構元只能一組
	{

		width = 10;
		height = 8;

	}

	public void show() {

		System.out.println("width=" + width);
		System.out.println("height=" + height + "\n");
	}

}

class CRectangle2 {
	int width;
	int height;

	public CRectangle2()// 沒有引數的建構元只能一組,所以設第二個Class
	{
		this(10, 8);
		int width;
		int height;
	}

	public CRectangle2(int w, int h) {
		width = w;
		height = h;
	}

	public void show() {

		System.out.println("width=" + width);
		System.out.println("height=" + height + "\n");
	}

}

public class Class01 {
	public static void main(String args[]) {
		CRectangle1 aa = new CRectangle1(10, 4);
		aa.show();
		CRectangle1 bb = new CRectangle1();
		bb.show();
		CRectangle2 cc = new CRectangle2();
		cc.show();
	}
}
