package VittorioVescio.u5w1d4.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VittorioVescio.u5w1d4.entities.ExtraAdditionDecorator;
import VittorioVescio.u5w1d4.entities.Pizza;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzaService {
	@Autowired
	private PizzaRepository menuRepo;

	public void save(Pizza p) {
		menuRepo.save(p);
		log.info("Prodotto salvato nel DB");
	}

	public void saveDecoratedPizza(ExtraAdditionDecorator e) {
		Pizza decoratedPizza = new Pizza();
		decoratedPizza.setNome(e.getNome());
		decoratedPizza.setCalorie(e.getCalorie());
		decoratedPizza.setIngredienti(e.getIngredienti());
		decoratedPizza.setPrezzo(e.getPrezzo());
		this.save(decoratedPizza);
	}

	public List<Pizza> findAll() {
		return menuRepo.findAll();
	}
}
