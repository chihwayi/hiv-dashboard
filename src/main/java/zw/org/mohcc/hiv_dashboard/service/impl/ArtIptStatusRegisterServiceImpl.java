package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.ArtIptStatusRegister;
import zw.org.mohcc.hiv_dashboard.repository.ArtIptStatusRegisterRepository;
import zw.org.mohcc.hiv_dashboard.service.ArtIptStatusRegisterService;

@Service
public class ArtIptStatusRegisterServiceImpl implements ArtIptStatusRegisterService {

    private final ArtIptStatusRegisterRepository artIptStatusRegisterRepository;

    @Autowired
    public ArtIptStatusRegisterServiceImpl(ArtIptStatusRegisterRepository artIptStatusRegisterRepository) {
        this.artIptStatusRegisterRepository = artIptStatusRegisterRepository;
    }

    @Override
    public Page<ArtIptStatusRegister> findAll(Pageable pageable) {
        return artIptStatusRegisterRepository.findAll(pageable);
    }
}
