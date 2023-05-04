package base;

import java.util.List;

public abstract class EmergencyBase {
    protected String nombre;
    protected int ambulancias;

    public abstract int getTiempoMedioAsistencia();
    public abstract void setTiempoMedioAsistencia(int averageAssistanceTime);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public int getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(int ambulances) {
        this.ambulancias = ambulances;
    }

    public abstract void addSubBase(EmergencyBase subBase);

    public abstract List<EmergencyBase> getSubBases();
}
