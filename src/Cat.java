
abstract class Cat {
	protected String name;
	protected int age;
	protected boolean female;
	protected double price;

	public Cat(String name, int age, boolean female, double price) {
		this.name = name;
		this.age = age;
		this.female = female;
		this.price = price;
	}

	public abstract String toString();

}
