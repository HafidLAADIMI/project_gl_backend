package project.gl.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gl.application.models.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Integer>{

}
