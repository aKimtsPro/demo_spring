package bstorm.akimts.demo_spring;

import bstorm.akimts.demo_spring.data.MarqueRepository;
import bstorm.akimts.demo_spring.models.entity.Marque;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(DemoSpringApplication.class, args);

		MarqueRepository repository = ctxt.getBean( MarqueRepository.class );

		Marque m = new Marque(5,"le belle marque", "lbm");
		repository.save(m);
		Marque m1 = new Marque(1, "la mauvaise marque", "lmm");
		m1 = repository.save(m1);

		repository.delete(m1);

		List<Marque> list = repository.findAll();

		Optional<Marque> optMarque = repository.findById(1L);

	}

}
