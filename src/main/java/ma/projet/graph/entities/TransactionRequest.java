package ma.projet.graph.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private Long compteId;
    private Double montant;
    private Date date;
    private TypeTransaction type;

}
