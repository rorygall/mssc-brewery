package gallagr.micro.mssc_brewery.services;

import gallagr.micro.mssc_brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
            .beerName("Galaxy Cat")
            .beerStyle("Pale Ale")
            .build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {

    }

    @Override
    public void deleteBeerById(UUID id) {
        log.debug("deleting beer with id:" + id);
    }
}
