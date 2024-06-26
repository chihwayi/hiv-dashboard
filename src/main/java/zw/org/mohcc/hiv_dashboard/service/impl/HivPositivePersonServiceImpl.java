package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.HivPositivePerson;
import zw.org.mohcc.hiv_dashboard.repository.HivPositivePersonRepository;
import zw.org.mohcc.hiv_dashboard.service.HivPositivePersonService;

@Service
public class HivPositivePersonServiceImpl implements HivPositivePersonService {


    private final HivPositivePersonRepository hivPositivePersonRepository;

    @Autowired
    public HivPositivePersonServiceImpl(HivPositivePersonRepository hivPositivePersonRepository){
        this.hivPositivePersonRepository = hivPositivePersonRepository;
    }
    @Override
    public Page<HivPositivePerson> findAll(Pageable pageable) {
        return hivPositivePersonRepository.findAll(pageable);
    }
}
