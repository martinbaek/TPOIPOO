package general;

import enums.TipoContragarantia;

import java.util.UUID;

public class Contragarantia {

    private UUID id;
    private TipoContragarantia tipoContragarantia;
    private double monto;

    public UUID getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }
}
