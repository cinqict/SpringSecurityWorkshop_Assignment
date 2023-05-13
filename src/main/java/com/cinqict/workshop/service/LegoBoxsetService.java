package com.cinqict.workshop.service;

import com.cinqict.workshop.domain.LegoBoxset;
import com.cinqict.workshop.repository.LegoBoxsetRepository;
import com.cinqict.workshop.service.implementation.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LegoBoxsetService extends CrudService<LegoBoxset, String> {

    public LegoBoxsetService(@Qualifier("inMemoryLegoBoxsetRepository") LegoBoxsetRepository repository) {
        super(repository);
    }
}
