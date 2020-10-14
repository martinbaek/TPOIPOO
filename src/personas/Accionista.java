package personas;

import java.util.UUID;

public class Accionista {

    private UUID id;
    private String cuit;
    private double participacion;

    public Accionista(UUID id, String cuit, double participacion) {
        this.id = id;
        this.cuit = cuit;
        this.participacion = participacion;
    }

    public UUID getId() {
        return id;
    }

    public String getCuit() {
        return cuit;
    }

    public double getParticipacion() {
        return participacion;
    }
}
