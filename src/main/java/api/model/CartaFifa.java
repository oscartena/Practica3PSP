package api.model;

public class CartaFifa {
    private int id;
    private String nombreJugador;
    private int media;
    private String promocion;

    public CartaFifa() {
    }

    public CartaFifa(int id, String nombreJugador, int media, String promocion) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.media = media;
        this.promocion = promocion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }
}
