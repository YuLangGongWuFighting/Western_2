
public class Print {
	boolean flag = true;

	public synchronized void printarr1(int a) {
		if (!flag) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.print("Thread1 print " + a + "   ");
		this.notifyAll();
		this.flag = !this.flag;
	}

	public synchronized void printarr2(int b) {
		if (flag) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.print("Thread2 print " + b + "   ");
		this.notifyAll();
		this.flag = !this.flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print print = new Print();
		new Arr1(print).start();
		new Arr2(print).start();
	}

}
