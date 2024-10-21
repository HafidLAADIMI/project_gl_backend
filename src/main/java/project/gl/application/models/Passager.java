package project.gl.application.models;

import java.util.Date;
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
public class Passager extends Personne {
    private String CIN;
    private Date dateNaissance;

    // the association with the Reservation class
    @OneToMany
    @JoinColumn(name = "reservation_id", insertable = false, updatable = false)
    private List<Reservation> reservation;

}
