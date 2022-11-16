package tn.esprit.dhia.entity;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFintContrat;
    private Spécialité spécialité;
    private Boolean   archive;
    @OneToOne
    private Etudiant etudiant;


}
