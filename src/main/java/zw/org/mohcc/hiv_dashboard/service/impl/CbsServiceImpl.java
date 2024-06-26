package zw.org.mohcc.hiv_dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv_dashboard.entity.Cbs;
import zw.org.mohcc.hiv_dashboard.repository.CbsRepository;
import zw.org.mohcc.hiv_dashboard.service.CbsService;

@Service
public class CbsServiceImpl implements CbsService {

    private final CbsRepository cbsRepository;

    @Autowired
    public CbsServiceImpl(CbsRepository cbsRepository) {
        this.cbsRepository = cbsRepository;
    }
    @Override
    public Page<Cbs> findAll(Pageable pageable) {
        return cbsRepository.findAll(pageable);
    }
}
