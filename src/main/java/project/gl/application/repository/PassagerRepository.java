package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gl.application.models.Passager;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRespository extends JpaRepository <Passager,Integer> {

}
