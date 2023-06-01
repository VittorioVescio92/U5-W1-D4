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
public class CocaCola extends Consumation {
	private String nome = "Coca Cola";
	private long calorie = 200;
	private double prezzo = 3.00;
	private double volume = 1.5;

	@Override
	public String toString() {
		return getNome() + " - Prezzo = " + "€ " + getPrezzo() + ", Calorie = " + getCalorie() + ", Volume = "
				+ getVolume() + " litri.";
	}
}
