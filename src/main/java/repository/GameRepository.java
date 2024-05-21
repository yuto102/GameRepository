package repository;
//GameRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
