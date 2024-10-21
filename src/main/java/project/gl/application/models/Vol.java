package project.gl.application.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vol")

public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vol_id;
    private String codeIATA;
    private int numVol;
    private Date dataVol;
    private String aeroportOrigin;
    private String aeroportDestination;

    // the association with Reservation class
    @OneToMany
    @JoinColumn(name = "reservation_id")
    private List<Reservation> reservation;

    // the association with Aeroport class
    @ManyToOne
    @JoinColumn(name = "aeroport_id")
    private Aeroport aeroport;
    // the association with Avion class
    @ManyToOne
    @JoinColumn(name = "avion_id")
    private Avion avion;
    // the association with Equipage class
    @ManyToOne
    @JoinColumn(name = "personne_id")
    private Equipage equipage;
}
