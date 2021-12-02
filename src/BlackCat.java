
class BlackCat extends Cat {

	public BlackCat(String name, int age, boolean female, double price) {
		super(name, age, female, price);
		this.price = 350;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String information = "the name of blackcat is " + name + " and the age of it is " + age + ". Is it female? " + female
				+ ". The price of it is " + price;
		return information;
	}

}
