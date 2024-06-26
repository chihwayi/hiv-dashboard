package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.AncRegister;
import zw.org.mohcc.hiv_dashboard.repository.AncRegisterRepository;
import zw.org.mohcc.hiv_dashboard.service.AncRegisterService;

@Service
public class AncRegisterServiceImpl implements AncRegisterService {

    private final AncRegisterRepository ancRegisterRepository;

    @Autowired
    public AncRegisterServiceImpl(AncRegisterRepository ancRegisterRepository) {
        this.ancRegisterRepository = ancRegisterRepository;
    }

    @Override
    public Page<AncRegister> findAll(Pageable pageable) {
        return ancRegisterRepository.findAll(pageable);
    }
}
