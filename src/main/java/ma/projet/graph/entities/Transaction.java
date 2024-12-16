package ma.projet.graph.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING) // Important pour stocker le type en String
    private TypeTransaction type;


    @ManyToOne // Relation Many-to-One avec Compte
    @JoinColumn(name = "compte_id") // Définit la clé étrangère
    private Compte compte;

}

