package project.gl.application.services;

import org.springframework.stereotype.Service;

import project.gl.application.models.Avion;
import project.gl.application.repository.AvionRepository;

@Service
public class AvionService {
    // the CRUD operations will be defined here

    private AvionRepository avionRepository;

    // get all Avions
    public Iterable<Avion> getAllAvions() {
        return avionRepository.findAll();
    }

    // get Avion by id
    public Avion getAvionById(int id) {
        return avionRepository.findById(id).orElse(null);
    }

    // create new Avion
    public Avion createAvion(Avion avion) {
        return avionRepository.save(avion);
    }

    // update Avion
    public Avion updateAvion(Avion avion) {
        return avionRepository.save(avion);
    }

    // delete Avion
    public void deleteAvion(int id) {
        avionRepository.deleteById(id);
    }

}
