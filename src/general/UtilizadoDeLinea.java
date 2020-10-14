package general;

import operaciones.Operacion;

import java.util.List;
import java.util.UUID;

public class UtilizadoDeLinea {

    private UUID id;
    private List<Operacion>  operacionesCertificadoEmitido;
    private RiesgoVivo riesgoVivo;
    private double totalUtilizado;

    public UtilizadoDeLinea(UUID id, RiesgoVivo riesgoVivo) {
        this.id = id;
        this.riesgoVivo = riesgoVivo;
    }

    public List<Operacion> getOperacionesCertificadoEmitido() {
        return operacionesCertificadoEmitido;
    }

    public double getTotalUtilizado() {
        return totalUtilizado;
    }

    public void addOperacion(Operacion operacion){
        if(operacion != null) {
            this.operacionesCertificadoEmitido.add(operacion);
        }
    }
}
