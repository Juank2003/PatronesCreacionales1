import base.EmergencyBase;
import builders.EmergencyBaseBuilder;
import builders.EmergencyBaseBuilderConcrete;
import builders.EmergencyBaseBuilderSimple;
import director.EmergencyServiceDirector;

public class Demo {

    public static void main(String[] args) {
        EmergencyServiceDirector director = new EmergencyServiceDirector(new EmergencyBaseBuilderConcrete());

        director.construirBaseCompuesta("Base compuesta");

        EmergencyBaseBuilder builderSimple = new EmergencyBaseBuilderSimple();
        builderSimple.setNombre("Base simple");
        builderSimple.setAmbulancias(5);
        builderSimple.setTiempoMedioAsistencia(10);
        director.agregarSubBase(builderSimple.getResult());

        EmergencyBaseBuilder builderSimple2 = new EmergencyBaseBuilderSimple();
        builderSimple2.setNombre("Otra base simple");
        builderSimple2.setAmbulancias(3);
        builderSimple2.setTiempoMedioAsistencia(5);
        director.agregarSubBase(builderSimple2.getResult());

        EmergencyBase baseCompuesta = director.obtenerResultado();
        System.out.println("Nombre: " + baseCompuesta.getNombre());
        System.out.println("Ambulancias: " + baseCompuesta.getAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseCompuesta.getTiempoMedioAsistencia());
        System.out.println("Sub-bases:");
        for (EmergencyBase subBase : baseCompuesta.getSubBases()) {
            System.out.println("- Nombre: " + subBase.getNombre() + ", Ambulancias: " + subBase.getAmbulancias() + ", Tiempo medio de asistencia: " + subBase.getTiempoMedioAsistencia());
        }
    }
}
