package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv_dashboard.service.ArtCurrentStatusRegisterService;

@Service
public class ArtCurrentStatusRegisterServiceImpl implements ArtCurrentStatusRegisterService {
    @Override
    public Page<ArtCurrentStatusRegister> findAll(Pageable pageable) {
        return null;
    }
}
