package personas;

import java.util.UUID;

public class Usuario {

    private String username;
    private String psw;
    private UUID id;

    public Usuario(String username, String psw, UUID id) {
        this.username = username;
        this.psw = psw;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
