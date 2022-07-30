package pl.mg.SellerMySQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mg.SellerMySQL.model.Employee;
import pl.mg.SellerMySQL.repository.EmployeeRepository;

@SpringBootApplication
public class SellerMySqlApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SellerMySqlApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Dareczek");
//		employee.setLastName("Jakiś");
//		employee.setEmail("dsadasio@hotmail.com");
//		employeeRepository.save(employee);

	}

}
