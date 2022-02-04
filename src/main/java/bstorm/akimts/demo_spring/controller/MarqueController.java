package bstorm.akimts.demo_spring.controller;

import bstorm.akimts.demo_spring.models.dto.MarqueDTO;
import bstorm.akimts.demo_spring.models.form.MarqueInsertForm;
import bstorm.akimts.demo_spring.service.MarqueService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/marque")
public class MarqueController {

    private final MarqueService service;

    public MarqueController(MarqueService service) {
        this.service = service;
    }

    @PostMapping("/add") // POST http://localhost:8080/marque/add
    public MarqueDTO insert(@Valid @RequestBody MarqueInsertForm form){
        return service.insert( form );
    }

}
