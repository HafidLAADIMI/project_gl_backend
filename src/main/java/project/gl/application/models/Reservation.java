package project.gl.application.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.gl.application.models.Enumeration.ReserveEnum;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservation_id;
    private Date dateReservation;
    private ReserveEnum statusEnum;
    private float prixTotl;

    // the association with the Passager class
    @ManyToOne
    @JoinColumn(name = "personne_id", nullable = false)
    private Passager passager;
    // the association with Vol class
    @OneToOne
    @JoinColumn(name = "vol_id")
    private Vol vol;

}
