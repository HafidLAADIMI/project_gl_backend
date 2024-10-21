package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Vol;
import project.gl.application.repository.VolRepository;

@Service
public class VolService {
    // The CRUD operations for Vol will be here
    @Autowired
    private VolRepository volRepository;

    // get all Vols
    public Iterable<Vol> getVols() {
        return volRepository.findAll();
    }

    // get Vol by id
    public Vol getVolById(int id) {
        return volRepository.findById(id).orElse(null);
    }

    // create new Vol
    public Vol createVol(Vol vol) {
        return volRepository.save(vol);
    }

    // update Vol
    public Vol updateVol(Vol vol) {
        return volRepository.save(vol);
    }

    // delete Vol
    public void deleteVol(int id) {
        volRepository.deleteById(id);
    }

}
