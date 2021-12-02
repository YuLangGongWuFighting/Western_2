import java.time.LocalDate;

public interface CatCafe {
	void buy(Cat cat);

	void entertainCustomer(Customer customer);

	void close(LocalDate localdate);

}
