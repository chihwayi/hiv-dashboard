package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.HtsScreeningRegister;
import zw.org.mohcc.hiv_dashboard.repository.HtsScreeningRegisterRepository;
import zw.org.mohcc.hiv_dashboard.service.HtsScreeningRegisterService;

@Service
public class HtsScreeningRegisterServiceImpl implements HtsScreeningRegisterService {

    private final HtsScreeningRegisterRepository htsScreeningRegisterRepository;

    @Autowired
    public HtsScreeningRegisterServiceImpl(HtsScreeningRegisterRepository repository) {
        this.htsScreeningRegisterRepository = repository;
    }

    @Override
    public Page<HtsScreeningRegister> findAll(Pageable pageable) {
        return htsScreeningRegisterRepository.findAll(pageable);
    }
}
