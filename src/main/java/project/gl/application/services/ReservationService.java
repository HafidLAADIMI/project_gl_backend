package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Reservation;
import project.gl.application.repository.ReservationRepository;

@Service
public class ReservationService {
    // The CRUD operations for Reservation
    @Autowired
    private ReservationRepository reservationRepository;

    // get all Reservations
    public Iterable<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // get Reservation by id
    public Reservation getReservationById(int id) {
        return reservationRepository.findById(id).orElse(null);
    }

    // create new Reservation
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // update Reservation
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // delete Reservation
    public void deleteReservation(int id) {
        reservationRepository.deleteById(id);
    }

}
