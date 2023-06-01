package VittorioVescio.u5w1d4.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import VittorioVescio.u5w1d4.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, UUID> {
}
