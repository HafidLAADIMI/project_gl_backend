package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gl.application.models.Equipage;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipageRepository extends JpaRepository<Equipage,Integer> {

}
