package br.com.ada.bankcode.producer;

import br.com.ada.bankcode.model.Chave;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ChaveProducerService {

    private final KafkaTemplate<String, Chave> kafkaTemplate;

    public ChaveProducerService(KafkaTemplate<String, Chave> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarChave(Chave chave) {
        String chaveId = UUID.randomUUID().toString();
        kafkaTemplate.send("TOPIC_CADASTRO_CHAVE", chave);
    }
}
