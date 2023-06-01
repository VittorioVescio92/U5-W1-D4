package VittorioVescio.u5w1d4.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import VittorioVescio.u5w1d4.entities.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, UUID> {

}
