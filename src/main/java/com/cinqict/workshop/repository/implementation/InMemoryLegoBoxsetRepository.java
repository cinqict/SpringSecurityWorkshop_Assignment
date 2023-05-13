package com.cinqict.workshop.repository.implementation;

import com.cinqict.workshop.domain.LegoBoxset;
import com.cinqict.workshop.repository.LegoBoxsetRepository;
import org.springframework.stereotype.Component;

@Component
public class InMemoryLegoBoxsetRepository extends InMemoryRepository<LegoBoxset, String> implements LegoBoxsetRepository {

    @Override
    protected <S extends LegoBoxset> String getId(S entity) {
        return entity.getSerialNumber();
    }
}
