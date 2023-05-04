package director;

import base.EmergencyBase;
import builders.EmergencyBaseBuilder;

public class EmergencyServiceDirector {

    private EmergencyBaseBuilder builder;

    public EmergencyServiceDirector(EmergencyBaseBuilder builder) {
        this.builder = builder;
    }

    public void construirBase(String nombre, int ambulancias, int tiempoMedioAsistencia) {
        builder.setNombre(nombre);
        builder.setAmbulancias(ambulancias);
        builder.setTiempoMedioAsistencia(tiempoMedioAsistencia);
    }

    public void construirBaseCompuesta(String nombre) {
        builder.setNombre(nombre);
    }

    public void agregarSubBase(EmergencyBase subBase) {
        builder.addSubBase(subBase);
    }

    public EmergencyBase obtenerResultado() {
        return builder.getResult();
    }
}

