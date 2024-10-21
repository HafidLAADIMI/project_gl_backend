package project.gl.application.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipage extends Personne {
    private String fonction;
    private String numeroLicence;
    // the association with Vol class
    @OneToMany
    @JoinColumn(name = "vol_id")    
    private List<Vol> vol;
}
