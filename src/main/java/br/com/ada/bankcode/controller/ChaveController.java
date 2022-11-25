package br.com.ada.bankcode.controller;

import br.com.ada.bankcode.model.Chave;
import br.com.ada.bankcode.service.ChaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pix/chaves")
@RequiredArgsConstructor
public class ChaveController {

    private final ChaveService chaveService;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody Chave chave) {
        chaveService.cadastrarChave(chave);
        return ResponseEntity.ok().build();
    }
}
