package operaciones;

import enums.EstadoOperacion;

import java.util.UUID;

public class Operacion {

    private UUID id;
    private EstadoOperacion estadoOperacion;
    private Comision comision;

    public Operacion(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
