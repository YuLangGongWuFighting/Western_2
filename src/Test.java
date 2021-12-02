import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCatCafe myCatCafe = new MyCatCafe(2000, new ArrayList<Cat>(), new ArrayList<Customer>());
		System.out.println("The information of buy cats");
		OrangeCat orangeCat1 = new OrangeCat("Emily", 2, true, 200, false);
		BlackCat blackCat1 = new BlackCat("Lily", 1, true, 350);
		BlackCat blackCat2 = new BlackCat("Tom", 2, false, 350);
		WhiteCat whiteCat1 = new WhiteCat("Peter", 3, false, 1000, 10);
		WhiteCat whiteCat2 = new WhiteCat("Sherry", 3, true, 2000, 8);
		try {
			myCatCafe.buy(orangeCat1);
			myCatCafe.buy(blackCat1);
			myCatCafe.buy(blackCat2);
			myCatCafe.buy(whiteCat1);
			myCatCafe.buy(whiteCat2);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The information of entertain customers");
		Customer customer1 = new Customer("Nicole", 3, LocalDate.of(2021, 11, 22));
		Customer customer2 = new Customer("Rachel", 2, LocalDate.of(2021, 11, 21));
		Customer customer3 = new Customer("Andre", 1, LocalDate.of(2021, 11, 22));
		try {
			myCatCafe.entertainCustomer(customer1);
			myCatCafe.entertainCustomer(customer2);
			myCatCafe.entertainCustomer(customer3);
		} catch (CatNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The information of today");
		myCatCafe.close(LocalDate.of(2021, 11, 22));

	}

}
