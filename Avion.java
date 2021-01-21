public class Avion extends Vehiculo {
    int z;
    boolean despegado;

    public Avion() {
        z = 0;
        despegado = false;
    }

    public void despegar() {
        z = 1;
        despegado = true;
    }

    public void subir() {
        z++;
    }

    public void subir(int n) {
        z = z + n;
    }

    public void bajar() {
        if (despegado) {
            z--;
        }
    }

    public void bajar(int n) {
        if (despegado & (z - n) >= 0) {
            z = z - n;
        }
    }

    public void imprimeEstado() {
        if (despegado) {
            System.out.println("El avion esta en el aire a " + z + " metros de altura, matricula ");
        } else {
            System.out.println("El avion esta en el suelo");
        }
    }
}