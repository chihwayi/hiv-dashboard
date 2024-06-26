package zw.org.mohcc.hiv_dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@Data
public class TptScreeningPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "patient_tpt_screening_id")
    private String patientTptScreeningId;

    @Column(name = "date")
    private LocalDateTime date;
}
