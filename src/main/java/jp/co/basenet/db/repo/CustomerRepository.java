package jp.co.basenet.db.repo;

import java.util.List;

import jp.co.basenet.db.model.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastname);
}
