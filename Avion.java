public class Avion extends Vehiculo implements Sumergible {
    int z;
    boolean despegado;
    String medio = "Tierra";
    String est = "Sin inmersion";

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

    public void cambioDeMedio() {
        if (this.getZ() == 0) {
            if (this.getMedio() == "Tierra") {
                this.setMedio("Agua");
            }
            if (this.getMedio() == "Agua") {
                this.setMedio("Tierra");
            }
        }
    }

    public void inmersion() {
        if (this.estado && this.medio == "Agua") {
            this.setEst("Inmersion");
            this.setZ(-1);
        }

    }

    public void ascender(int n) {
        if (this.estado && this.medio == "Agua" && this.est == "Inmersion") {
            z = z + n;
            if (z >= 0) {
                this.setEst("Sin inmesion");
                this.setZ(0);
            }
        }
    }

    public void descender(int n) {
        if (this.estado && this.medio == "Agua" && this.est == "Inmersion") {
            z = z - n;
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

    public String getEst() {
        return this.est;
    }

    public void setEst(String est) {
        this.est = est;
    }
}