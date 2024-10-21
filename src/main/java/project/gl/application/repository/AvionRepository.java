package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gl.application.models.Avion;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<Avion,Integer> {

}
