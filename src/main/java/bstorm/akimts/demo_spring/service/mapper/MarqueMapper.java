package bstorm.akimts.demo_spring.service.mapper;

import bstorm.akimts.demo_spring.models.dto.MarqueDTO;
import bstorm.akimts.demo_spring.models.entity.Marque;
import bstorm.akimts.demo_spring.models.form.MarqueInsertForm;
import org.springframework.stereotype.Service;

@Service
public class MarqueMapper {

    // dto -> form // NO
    // dto -> entity // NO
    // form -> dto // NO
    // form -> entity // YES
//    public Marque toEntity(MarqueInsertForm form){
//      ...
//    } // QUID DE MULTIPLE FORM? => on met la methode dans les forms
    // entity -> form // NO
    // entity -> dto // YES
    public MarqueDTO toDto(Marque entity){

        if( entity == null )
            return null;

        return MarqueDTO.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .build();

    }

}
