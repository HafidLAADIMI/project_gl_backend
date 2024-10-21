package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gl.application.models.Vol;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol, Integer> {

}
