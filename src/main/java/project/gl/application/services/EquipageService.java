package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Equipage;
import project.gl.application.repository.EquipageRepository;

@Service
public class EquipageService {
    // the CRUD operations for Equipage will be here

    @Autowired
    private EquipageRepository equipageRepository;

    // get all Equipages
    public Iterable<Equipage> getAllEquipages() {
        return equipageRepository.findAll();
    }

    // get Equipage by id
    public Equipage getEquipageById(int id) {
        return equipageRepository.findById(id).orElse(null);
    }

    // create new Equipage
    public Equipage createEquipage(Equipage equipage) {
        return equipageRepository.save(equipage);
    }

    // update Equipage
    public Equipage updateEquipage(Equipage equipage) {
        return equipageRepository.save(equipage);
    }

    // delete Equipage
    public void deleteEquipage(int id) {
        equipageRepository.deleteById(id);
    }

}
