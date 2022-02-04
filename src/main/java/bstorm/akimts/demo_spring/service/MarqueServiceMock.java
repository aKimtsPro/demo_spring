package bstorm.akimts.demo_spring.service;

import bstorm.akimts.demo_spring.models.dto.MarqueDTO;
import bstorm.akimts.demo_spring.models.form.MarqueInsertForm;
import org.springframework.stereotype.Service;

//@Service
public class MarqueServiceMock implements MarqueService{
    @Override
    public MarqueDTO insert(MarqueInsertForm toInsert) {
        return MarqueDTO.builder().build();
    }
}
