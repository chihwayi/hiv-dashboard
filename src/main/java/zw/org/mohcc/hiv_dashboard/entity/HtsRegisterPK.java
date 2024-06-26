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
public class HtsRegisterPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "hts_id")
    private String htsId;

    @Column(name = "hts_date")
    private LocalDateTime htsDate;
}
