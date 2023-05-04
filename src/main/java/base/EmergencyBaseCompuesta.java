package base;


import java.util.ArrayList;
import java.util.List;

public class EmergencyBaseCompuesta extends EmergencyBase {
    protected List<EmergencyBase> subBases = new ArrayList<>();
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
        subBases.add(subBase);
        ambulancias += subBase.getAmbulancias();
        tiempoMedioAsistencia = subBases.stream()
                .mapToInt(EmergencyBase::getTiempoMedioAsistencia)
                .sum() / subBases.size();
    }

    @Override
    public List<EmergencyBase> getSubBases() {
        return subBases;
    }
}
