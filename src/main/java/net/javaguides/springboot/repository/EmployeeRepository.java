package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods

    //只显示头20个数
    Pageable pageable = PageRequest.of(0, 20, Sort.by("id").descending());
    @Query("SELECT e FROM Employee e ORDER BY e.id DESC")
    List<Employee> findAllDescById(Pageable pageable);
}