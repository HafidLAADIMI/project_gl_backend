package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Passager;
import project.gl.application.repository.PassagerRepository;

@Service
public class PassagerService {
    // The CRUD operations for Passager are done here

    @Autowired
    private PassagerRepository passagerRepository;

    // get all Passagers
    public Iterable<Passager> getAllPassagers() {
        return passagerRepository.findAll();
    }

    // get Passager by id
    public Passager getPassagerById(int id) {
        return passagerRepository.findById(id).orElse(null);
    }

    // create new Passager
    public Passager createPassager(Passager passager) {
        return passagerRepository.save(passager);
    }

    // update Passager
    public Passager updatePassager(Passager passager) {
        return passagerRepository.save(passager);
    }

    // delete Passager
    public void deletePassager(int id) {
        passagerRepository.deleteById(id);
    }
}
