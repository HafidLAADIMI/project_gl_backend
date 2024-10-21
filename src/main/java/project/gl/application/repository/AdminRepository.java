package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gl.application.models.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
