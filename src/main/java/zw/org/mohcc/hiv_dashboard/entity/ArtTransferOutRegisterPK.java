package zw.org.mohcc.hiv_dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class ArtTransferOutRegisterPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "art_transfer_out_register_id")
    private String artTransferOutRegisterId;

    @Column(name = "art_id")
    private String artId;
}
