package com.alvestech.votatech.pauta.application.service;

import com.alvestech.votatech.pauta.application.api.NovaPautaRequest;
import com.alvestech.votatech.pauta.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);

}