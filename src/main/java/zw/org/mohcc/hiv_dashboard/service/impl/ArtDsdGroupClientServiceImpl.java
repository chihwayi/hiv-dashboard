package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroupClient;
import zw.org.mohcc.hiv_dashboard.repository.ArtDsdGroupClientRepository;
import zw.org.mohcc.hiv_dashboard.service.ArtDsdGroupClientService;

@Service
public class ArtDsdGroupClientServiceImpl implements ArtDsdGroupClientService {

    private final ArtDsdGroupClientRepository artDsdGroupClientRepository;

    @Autowired
    public ArtDsdGroupClientServiceImpl(ArtDsdGroupClientRepository artDsdGroupClientRepository) {
        this.artDsdGroupClientRepository = artDsdGroupClientRepository;
    }

    @Override
    public Page<ArtDsdGroupClient> findAll(Pageable pageable) {
        return artDsdGroupClientRepository.findAll(pageable);
    }
}
