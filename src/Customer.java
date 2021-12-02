import java.time.LocalDate;

public class Customer {
	String name;
	int rua;
	LocalDate ld;

	public Customer(String name, int rua, LocalDate ld) {
		this.name = name;
		this.rua = rua;
		this.ld = ld;
	}

	@Override
	public String toString() {
		return "Customer name=" + name + ", rua=" + rua + ", arrive time =" + ld;
	}

}
