
class OrangeCat extends Cat {
	boolean isFat;

	public OrangeCat(String name, int age, boolean female, double price, boolean isFat) {
		super(name, age, female, price);
		this.price = 200;
		this.isFat = isFat;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String information = "the name of orangecat is " + name + " and the age of it is " + age + ". Is it female? "
				+ female + ". The price of it is " + price + ". Is it fat? " + isFat;
		return information;
		// TODO Auto-generated method stub

	}

}
