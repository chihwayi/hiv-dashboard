package zw.org.mohcc.hiv_dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class HivPositivePersonPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "investigation_order_id")
    private String investigationOrderId;

    @Column(name = "person_id")
    private String personId;
}
