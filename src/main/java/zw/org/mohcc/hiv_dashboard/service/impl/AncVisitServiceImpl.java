package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.AncVisit;
import zw.org.mohcc.hiv_dashboard.repository.AncVisitRepository;
import zw.org.mohcc.hiv_dashboard.service.AncVisitService;

@Service
public class AncVisitServiceImpl implements AncVisitService {

    private final AncVisitRepository ancVisitRepository;

    @Autowired
    public AncVisitServiceImpl(AncVisitRepository ancVisitRepository) {
        this.ancVisitRepository = ancVisitRepository;
    }

    @Override
    public Page<AncVisit> findAll(Pageable pageable) {
        return ancVisitRepository.findAll(pageable);
    }
}
