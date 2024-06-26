package zw.org.mohcc.hiv_dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroupClient;

public interface ArtDsdGroupClientService {

    Page<ArtDsdGroupClient> findAll(Pageable pageable);
}
