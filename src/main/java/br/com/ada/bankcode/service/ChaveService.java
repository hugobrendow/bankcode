package br.com.ada.bankcode.service;

import br.com.ada.bankcode.model.Chave;
import br.com.ada.bankcode.producer.ChaveProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChaveService {
    private final ChaveProducerService chaveProducerService;

    public void cadastrarChave(Chave chave) {
        chaveProducerService.enviarChave(chave);
    }
}
