package operaciones;

import java.util.UUID;

public class Tipo2 extends Operacion {

    private double monto;

    public Tipo2(UUID id) {
        super(id);
    }

    public double getMonto() {
        return monto;
    }
}
