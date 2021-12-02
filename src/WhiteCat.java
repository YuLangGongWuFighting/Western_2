
class WhiteCat extends Cat {
	double weight;

	public WhiteCat(String name, int age, boolean female, double price, double weight) {
		super(name, age, female, price);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String information = "the name of white cat is " + name + " and the age of it is " + age + ". Is it female? "
				+ female + ". The price of it is " + price + " and the weight of it is " + weight;
		return information;
	}

}
