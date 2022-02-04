package bstorm.akimts.demo_spring.service;

import bstorm.akimts.demo_spring.models.dto.MarqueDTO;
import bstorm.akimts.demo_spring.models.form.MarqueInsertForm;

public interface MarqueService {

    MarqueDTO insert(MarqueInsertForm toInsert);

}
