package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.ArtTransferOutRegister;
import zw.org.mohcc.hiv_dashboard.repository.ArtTransferOutRegisterRepository;
import zw.org.mohcc.hiv_dashboard.service.ArtTransferOutRegisterService;

@Service
public class ArtTransferOutRegisterServiceImpl implements ArtTransferOutRegisterService {

    private final ArtTransferOutRegisterRepository artTransferOutRegisterRepository;

    @Autowired
    public ArtTransferOutRegisterServiceImpl(ArtTransferOutRegisterRepository artTransferOutRegisterRepository) {
        this.artTransferOutRegisterRepository = artTransferOutRegisterRepository;
    }

    @Override
    public Page<ArtTransferOutRegister> findAll(Pageable pageable) {
        return artTransferOutRegisterRepository.findAll(pageable);
    }
}
