public class Avion extends Vehiculo {
    int z;
    boolean despegado;
    String medio = "Tierra";

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
            System.out.println("El avion esta en el aire a " + z + " metros de altura");
        } else {
            System.out.println("El avion esta en el suelo");
        }
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean isDespegado() {
        return this.despegado;
    }

    public boolean getDespegado() {
        return this.despegado;
    }

    public void setDespegado(boolean despegado) {
        this.despegado = despegado;
    }

    public String getMedio() {
        return this.medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}