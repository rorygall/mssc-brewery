package gallagr.micro.mssc_brewery.services;

import gallagr.micro.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    CustomerDto save(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomerById(UUID id);
}
