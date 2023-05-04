package builders;

import base.EmergencyBaseCompuesta;
import base.EmergencyBase;

public class EmergencyBaseBuilderConcrete implements EmergencyBaseBuilder {
    private EmergencyBaseCompuesta baseCompuesta;

    public EmergencyBaseBuilderConcrete() {
        this.baseCompuesta = new EmergencyBaseCompuesta();
    }

    @Override
    public void setNombre(String name) {
        this.baseCompuesta.setNombre(name);
    }

    @Override
    public void setAmbulancias(int ambulancias) {
        // No se usa en este caso
    }

    @Override
    public void setTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        // No se usa en este caso
    }

    @Override
    public void addSubBase(EmergencyBase subBase) {
        this.baseCompuesta.addSubBase(subBase);
    }

    @Override
    public EmergencyBaseCompuesta getResult() {
        return this.baseCompuesta;
    }
}
