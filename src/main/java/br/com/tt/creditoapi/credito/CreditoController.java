package br.com.tt.creditoapi.credito;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credito")
public class CreditoController {

    private CreditoService creditoService;

    public CreditoController(CreditoService creditoService) {
        this.creditoService = creditoService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Credito> consultaPor(@PathVariable String cpf) {
        return ResponseEntity.ok(creditoService.consultaPor(cpf));
    }

}
