import java.util.*;

public class PruebaVehiculos {
    public static void main(String[] arg) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Coche coche = new Coche();
        Avion avion = new Avion();
        CocheAcuatico cocheAcuatico = new CocheAcuatico();

        vehiculos.add(new Coche());
        vehiculos.add(new Coche("Peugeot", "GR87654", "Blanco Blanquise"));
        vehiculos.add(new Avion());
        vehiculos.add(new CocheAcuatico());

        coche.imprimeEstado();
        System.out.println(coche.getDireccion());
        coche.girar(1);
        coche.mover(5);
        System.out.println(coche.getDireccion());

        avion.despegar();
        avion.subir(10);
        avion.imprimeEstado();

        cocheAcuatico.setMedio("Agua");
        cocheAcuatico.inmersion();
        cocheAcuatico.descender(10);
        cocheAcuatico.ascender(2);
        cocheAcuatico.imprimeEstado();

        for (int i = 0; i < vehiculos.size(); i++) {
            vehiculos.get(i).imprimeEstado();
        }
    }
}
