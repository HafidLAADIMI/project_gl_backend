package project.gl.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gl.application.models.Admin;
import project.gl.application.repository.AdminRepository;

@Service
public class AdminService {
    // the CRUD operations for the admin model will be here

    @Autowired
    private AdminRepository adminRepository;

    // get all admins

    public Iterable<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // get admin by id
    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    // create admin
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // update admin
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // delete admin
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }

}
