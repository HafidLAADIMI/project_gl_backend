
package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Aeroport;
import project.gl.application.repository.AeroportRepository;

@Service
public class AeroportService {
    // The CRUD opertaion will be done here
    @Autowired
    private AeroportRepository aeroportRepository;

    // get all aeroport
    public Iterable<Aeroport> getAllAeroport() {
        return aeroportRepository.findAll();
    }

    // get aeroport by id
    public Aeroport getAeroportById(int id) {
        return aeroportRepository.findById(id).orElse(null);
    }

    // create aeroport
    public Aeroport createAeroport(Aeroport aeroport) {
        return aeroportRepository.save(aeroport);
    }

    // update aeroport
    public Aeroport updateAeroport(Aeroport aeroport) {
        return aeroportRepository.save(aeroport);
    }

    // delete aeroport
    public void deleteAeroport(int id) {
        aeroportRepository.deleteById(id);
    }
}
