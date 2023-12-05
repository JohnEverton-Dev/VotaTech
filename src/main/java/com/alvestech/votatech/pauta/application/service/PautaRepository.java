package com.alvestech.votatech.pauta.application.service;

import com.alvestech.votatech.pauta.domain.Pauta;

public interface PautaRepository {
    Pauta salva(Pauta pauta);
}