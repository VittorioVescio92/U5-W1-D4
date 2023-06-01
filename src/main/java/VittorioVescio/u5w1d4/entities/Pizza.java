package VittorioVescio.u5w1d4.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pizza extends Consumation {

	private String ingredienti = "Pomodoro, Mozzarella";
	private String nome = "Margherita";
	private long calorie = 500;
	private double prezzo = 4.50;

	@Override
	public String toString() {
		return "Pizza " + getNome() + " - Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + ".";
	}

	public String orderPrint() {
		return "Pizza " + getNome() + " - Prezzo = " + "€ " + getPrezzo() + ".";
	}
}
