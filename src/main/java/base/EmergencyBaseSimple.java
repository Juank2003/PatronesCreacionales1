package base;

import java.util.List;

public class EmergencyBaseSimple extends EmergencyBase {
    protected int tiempoMedioAsistencia;

    @Override
    public int getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    @Override
    public void setTiempoMedioAsistencia(int averageAssistanceTime) {
        this.tiempoMedioAsistencia = averageAssistanceTime;
    }

    @Override
    public void addSubBase(EmergencyBase subBase) {
    }

    @Override
    public List<EmergencyBase> getSubBases() {
        return null;
    }
}
