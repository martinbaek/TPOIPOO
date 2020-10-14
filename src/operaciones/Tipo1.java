package operaciones;

import java.util.UUID;

public class Tipo1 extends Operacion{

    private double monto;

    public Tipo1(UUID id) {
        super(id);
    }

    public double getMonto() {
        return monto;
    }
}
