package zw.org.mohcc.hiv_dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv_dashboard.entity.ArtAppointment;

import java.util.List;
import java.util.Optional;

public interface ArtAppointmentService {

    List<ArtAppointment> findArtAppointmentBySiteId(String id);
    Page<ArtAppointment> findAll(Pageable pageable);
    Optional<ArtAppointment> getById(String artAppointmentRegisterId, String artId);
}
