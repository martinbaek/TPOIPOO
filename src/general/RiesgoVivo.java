package general;

import operaciones.Tipo1;
import operaciones.Tipo2;
import operaciones.Tipo3;

import java.util.List;
import java.util.UUID;

public class RiesgoVivo {

    private UUID id;
    private List<Tipo1> operacionesTipo1;
    private List<Tipo2> operacionesTipo2;
    private List<Tipo3> operacionesTipo3;
    private double importeTotalRiesgo;
    private double importeTotalOperaciones;
    private double importeUtilizado;
    private int cuotasImpagas;

    public RiesgoVivo(UUID id) {
        this.id = id;
    }

    public double getImporteTotalRiesgo() {
        return importeTotalRiesgo;
    }

    public double getImporteTotalOperaciones() {
        return importeTotalOperaciones;
    }

    public double getImporteUtilizado() {
        return importeUtilizado;
    }

    public int getCuotasImpagas() {
        return cuotasImpagas;
    }


}
