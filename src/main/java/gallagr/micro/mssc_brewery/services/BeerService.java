package gallagr.micro.mssc_brewery.services;

import gallagr.micro.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerByID(UUID beerId);

    BeerDto save(BeerDto beerDto);

    void updateBeer(UUID id, BeerDto beerDto);

    void deleteBeerById(UUID id);
}
