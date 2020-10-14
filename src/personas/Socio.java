package personas;

import enums.TipoEmpresa;
import general.Contragarantia;
import general.RiesgoVivo;
import general.UtilizadoDeLinea;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Socio {

    private UUID id;
    private String cuit;
    private String razonSocial;
    private Date fechaInicioActividades;
    private TipoEmpresa tipoEmpresa;
    private String actividadPrincipal;
    private String direccion;
    private String telefono;
    private String email;
    private boolean isPleno;
    private List<Accionista> accionistas;
    private RiesgoVivo riesgoVivo;
    private UtilizadoDeLinea utilizadoLinea;
    private List<Contragarantia> contragarantias;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Date getFechaInicioActividades() {
        return fechaInicioActividades;
    }

    public void setFechaInicioActividades(Date fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPleno() {
        return isPleno;
    }

    public void setPleno(boolean pleno) {
        isPleno = pleno;
    }
}
