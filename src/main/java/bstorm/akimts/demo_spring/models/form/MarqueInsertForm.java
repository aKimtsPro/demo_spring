package bstorm.akimts.demo_spring.models.form;

import bstorm.akimts.demo_spring.models.entity.Marque;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Validated
public class MarqueInsertForm {

    @NotBlank
    private String nom;
    @Size(min = 3, max = 4)
    private String nomStock;

    public Marque toEntity(){
        Marque m = new Marque();
        m.setNom(nom);
        m.setNomStock(nomStock.toUpperCase());
        return m;
    }

}
