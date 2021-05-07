import java.util.Date;

import Adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {
public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		
		Customer customer = new Customer(1,"Elif Rana", "Yýlancý", "43456927898", new Date(2000,04,03));
		customerManager.save(customer);
	}

}
