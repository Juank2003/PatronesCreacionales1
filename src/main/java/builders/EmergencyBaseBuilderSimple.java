
package builders;

import base.EmergencyBaseSimple;
import base.EmergencyBase;

public class EmergencyBaseBuilderSimple implements EmergencyBaseBuilder {
    private EmergencyBaseSimple baseSimple;

    public EmergencyBaseBuilderSimple() {
        this.baseSimple = new EmergencyBaseSimple();
    }

    @Override
    public void setNombre(String nombre) {
        this.baseSimple.setNombre(nombre);
    }

    @Override
    public void setAmbulancias(int ambulancias) {
        this.baseSimple.setAmbulancias(ambulancias);
    }

    @Override
    public void setTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        this.baseSimple.setTiempoMedioAsistencia(tiempoMedioAsistencia);
    }

    @Override
    public void addSubBase(EmergencyBase subBase) {
        // No se usa en este caso
    }

    @Override
    public EmergencyBaseSimple getResult() {
        return this.baseSimple;
    }
}
