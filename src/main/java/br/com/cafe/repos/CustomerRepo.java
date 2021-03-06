package br.com.cafe.repos;

import br.com.cafe.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findCustomerByCpf(String cpf);

}
