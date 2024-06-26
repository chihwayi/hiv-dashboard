package zw.org.mohcc.hiv_dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv_dashboard.entity.AncBookedRegister;

import java.util.List;
import java.util.Optional;

public interface AncBookedRegisterService {
    Page<AncBookedRegister> findAll(Pageable pageable);
    Optional<AncBookedRegister> getById(String ancId, String patientId);
}
