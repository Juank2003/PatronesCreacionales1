package builders;

import base.EmergencyBase;
public interface EmergencyBaseBuilder {

    void setNombre(String name);
    void setAmbulancias(int ambulances);
    void setTiempoMedioAsistencia(int averageAssistanceTime);
    void addSubBase(EmergencyBase subBase);
    EmergencyBase getResult();
}

