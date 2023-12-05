package com.alvestech.votatech.pauta.application.infra;

import com.alvestech.votatech.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJPARepository extends JpaRepository<Pauta, UUID> {
}