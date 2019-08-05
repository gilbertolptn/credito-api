package br.com.tt.creditoapi.credito;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CreditoService {

    @Cacheable(key = "#cpf", cacheNames = "creditos")
    public Credito consultaPor(String cpf) {

        Credito credito = new Credito();

        if (!isPositivado()) {
            credito.setSituacao("NORMAL");
            credito.setPontos(new Random().ints(0, 1000).findFirst().getAsInt());
        } else {
            credito.setSituacao("NEGATIVADO");
            credito.setPontos(new Random().ints(-999, -1).findFirst().getAsInt());
        }

        return credito;
    }

    private boolean isPositivado() {
        return new Random().ints(0, 2).findFirst().getAsInt() == 0;
    }
}