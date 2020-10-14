package operaciones;

import enums.EstadoComision;

import java.util.UUID;

public class Comision {

    private UUID id;
    private double porcentaje;
    private EstadoComision estadoComision;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public EstadoComision getEstadoComision() {
        return estadoComision;
    }

    public void setEstadoComision(EstadoComision estadoComision) {
        this.estadoComision = estadoComision;
    }
}
