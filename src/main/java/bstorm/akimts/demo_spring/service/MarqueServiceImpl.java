package bstorm.akimts.demo_spring.service;

import bstorm.akimts.demo_spring.data.MarqueRepository;
import bstorm.akimts.demo_spring.models.dto.MarqueDTO;
import bstorm.akimts.demo_spring.models.entity.Marque;
import bstorm.akimts.demo_spring.models.form.MarqueInsertForm;
import bstorm.akimts.demo_spring.service.mapper.MarqueMapper;
import org.springframework.stereotype.Service;

@Service
public class MarqueServiceImpl implements MarqueService{

    private final MarqueRepository repository;
    private final MarqueMapper mapper;

    public MarqueServiceImpl(MarqueRepository repository, MarqueMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MarqueDTO insert(MarqueInsertForm toInsert) {
        Marque inserted = repository.save( toInsert.toEntity() );
        return mapper.toDto(inserted);
    }

}
