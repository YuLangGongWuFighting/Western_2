
public class Arr1 extends Thread {
	Print print;

	public Arr1(Print print) {
		this.print = print;
	}

	int[] arr1 = { 1, 3, 5, 7, 9 };

	public void run() {
		for (int i = 0; i < arr1.length; i++) {
			print.printarr1(arr1[i]);
		}
	}

}
