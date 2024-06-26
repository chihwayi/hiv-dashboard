package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.TptScreening;
import zw.org.mohcc.hiv_dashboard.repository.TptScreeningRepository;
import zw.org.mohcc.hiv_dashboard.service.TptScreeningService;

@Service
public class TptScreeningServiceImpl implements TptScreeningService {

    private final TptScreeningRepository tptScreeningRepository;

    @Autowired
    public TptScreeningServiceImpl(TptScreeningRepository tptScreeningRepository) {
        this.tptScreeningRepository = tptScreeningRepository;
    }

    @Override
    public Page<TptScreening> findAll(Pageable pageable) {
        return tptScreeningRepository.findAll(pageable);
    }
}
