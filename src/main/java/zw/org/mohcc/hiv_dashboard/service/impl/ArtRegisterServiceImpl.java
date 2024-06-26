package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.ArtRegister;
import zw.org.mohcc.hiv_dashboard.repository.ArtRegisterRepository;
import zw.org.mohcc.hiv_dashboard.service.ArtRegisterService;

@Service
public class ArtRegisterServiceImpl implements ArtRegisterService {

    private final ArtRegisterRepository artRegisterRepository;

    @Autowired
    public ArtRegisterServiceImpl(ArtRegisterRepository artRegisterRepository) {
        this.artRegisterRepository = artRegisterRepository;
    }

    @Override
    public Page<ArtRegister> findAll(Pageable pageable) {
        return artRegisterRepository.findAll(pageable);
    }
}
