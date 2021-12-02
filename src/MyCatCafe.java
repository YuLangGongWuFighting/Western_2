import java.util.ArrayList;
import java.time.LocalDate;

class MyCatCafe implements CatCafe {
	double balance;
	ArrayList<Cat> catList;
	ArrayList<Customer> customerList;

	public MyCatCafe(double balance, ArrayList<Cat> catList, ArrayList<Customer> customerList) {
		super();
		this.balance = balance;
		this.catList = catList;
		this.customerList = customerList;
	}

	@Override
	public void buy(Cat cat) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		if (balance - cat.price >= 0) {
			balance = balance - cat.price;
			catList.add(cat);
			System.out.println("Buy " + cat.name + " success and the balance is " + balance);
		} else {
			throw new InsufficientBalanceException("Insufficient balance in the store, purchase failed");
		}
	}

	@Override
	public void entertainCustomer(Customer customer) throws CatNotFoundException {
		// TODO Auto-generated method stub
		if (!customerList.contains(customer)) {
			customerList.add(customer);
		}
		if (catList.size() > 0) {
			for (int i = 0; i < customer.rua; i++) {
				balance = balance + 15;
				int index = (int) (Math.random() * catList.size());
				System.out.println(customer.name + " rua cat which information is " + catList.get(index).toString());
			}
		}

		else {
			throw new CatNotFoundException("There is no cat which can rua");
		}
	}

	@Override
	public void close(LocalDate localdate) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).ld.isEqual(localdate)) {
				System.out.println(customerList.get(i).toString());
				total = total + customerList.get(i).rua;
			}

		}
		System.out.println("Profit of today " + (total * 15));
	}

}
