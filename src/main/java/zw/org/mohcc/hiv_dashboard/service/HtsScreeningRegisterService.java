package zw.org.mohcc.hiv_dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv_dashboard.entity.HtsScreeningRegister;

public interface HtsScreeningRegisterService {

    Page<HtsScreeningRegister> findAll(Pageable pageable);
}
