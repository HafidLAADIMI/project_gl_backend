package project.gl.application.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name  = "aeroport")
public class Aeroport {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   private int aeroport_id;
   private String codeIATA;
   private String nomAeroport;
   private String ville;
   private String pays;
   private int capacitePassagers;
   // the association with the Vol class
   @OneToMany 
   @JoinColumn(name = "vol_id")
   private List<Vol> vol;
}
