package gallagr.micro.mssc_brewery.services;

import gallagr.micro.mssc_brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Diego Maradona")
            .build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomerById(UUID id) {
        log.debug("deleting customer");
    }
}
