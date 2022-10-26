class CCount {
	static int cnt = 0;

	public CCount() {
		cnt++;
	}

	public void count() {
		System.out.println(cnt + "object(s) created");
	}

	void setZero() {
		cnt = 0;
	}

	void setValue(int n) {
		cnt = n;
	}

}

public class Class05 {
	public static void main(String args[]) {
		CCount a = new CCount();
		a.count();
		CCount b = new CCount();
		CCount c = new CCount();
		CCount d = new CCount();
		b.count();
		a.setZero();
		c.count();
		a.setValue(100);
		d.count();
	}
}
