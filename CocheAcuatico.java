public class CocheAcuatico extends Coche implements Sumergible {
    int z;
    boolean estado = false;
    String medio;

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMedio() {
        return this.medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public CocheAcuatico() {
        z = 0;
        estado = false;
        medio = "Tierra";
    }

    public boolean estaInmerso() {
        return estado;
    }

    public boolean estaEnElAgua() {
        return estado;
    }

    public void imprimeEstado() {
        if (estado) {
            System.out
                    .println("las coordenadas z del coche acuatico son: " + z + ", esta en " + medio + " y bajo agua");
        } else {
            System.out.println(
                    "las coordenadas z del coche acuatico son: " + z + ", esta en " + medio + " y no esta bajo agua");
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
        if (this.estado == false && this.medio == "Agua") {
            this.setEstado(true);
            this.setZ(-1);
        }

    }

    public void ascender(int n) {
        if (this.estado && this.medio == "Agua" && this.estado == true) {
            z = z + n;
            if (z >= 0) {
                this.setEstado(false);
                this.setZ(0);
            }
        }
    }

    public void descender(int n) {
        if (this.estado && this.medio == "Agua") {
            z = z - n;
        }
    }
}
