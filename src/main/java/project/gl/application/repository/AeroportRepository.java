package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.gl.application.models.Aeroport;
import org.springframework.stereotype.Repository;

@Repository
public interface AeroportRepository extends JpaRepository<Aeroport,Integer> {

}
