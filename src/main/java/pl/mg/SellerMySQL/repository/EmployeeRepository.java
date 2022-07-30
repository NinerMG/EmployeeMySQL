package pl.mg.SellerMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mg.SellerMySQL.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
