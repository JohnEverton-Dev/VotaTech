package com.alvestech.votatech.pauta.application.infra;

import com.alvestech.votatech.pauta.application.service.PautaRepository;
import com.alvestech.votatech.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[start] PautaInfraRepository - salva");
        Pauta newPauta = pautaSpringDataJPARepository.save(pauta);
        log.info("[finish] PautaInfraRepository - salva");
        return newPauta;
    }
}
