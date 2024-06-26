package zw.org.mohcc.hiv_dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv_dashboard.entity.ArtVisitRegister;

public interface ArtVisitRegisterService {

    Page<ArtVisitRegister> findAll(Pageable pageable);
}
