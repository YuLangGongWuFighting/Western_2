
public class Arr2 extends Thread {
	Print print;

	public Arr2(Print print) {
		this.print = print;
	}

	int[] arr2 = { 2, 4, 6, 8, 10 };

	public void run() {
		for (int i = 0; i < arr2.length; i++) {
			print.printarr2(arr2[i]);
		}
	}

}
