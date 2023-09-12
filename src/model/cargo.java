
package model;


public class cargo {
    int id;
    String nombreCargo;

    public cargo() {
    }

    public cargo(int id, String nombreCargo) {
        this.id = id;
        this.nombreCargo = nombreCargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
    
}
