public class Vehiculo {
    int x, e;
    Boolean estado;
    String direccion;

    public Vehiculo() {
        x = 0;
        e = 0;
        estado = true;
        direccion = "Este";
    }

    public Vehiculo(int cordX, int cordE, boolean est, String dire) {
        x = cordX;
        e = cordE;
        estado = est;
        direccion = dire;
    }

    public void parar() {
        estado = false;
    }

    public void arrancar() {
        estado = true;
    }

    public void mover() {
        if (estado) {
            if (direccion == "Este") {
                e++;
            }
            if (direccion == "Oeste") {
                e--;
            }
            if (direccion == "Norte") {
                x++;
            }
            if (direccion == "Sur") {
                x--;
            }
        }
    }

    public void mover(int n) {
        if (estado) {
            if (direccion == "Este") {
                e = e + n;
            }
            if (direccion == "Oeste") {
                e = e - n;
            }
            if (direccion == "Norte") {
                x = x + n;
            }
            if (direccion == "Sur") {
                x = x - n;
            }
        }
    }

    public void girar(int giro) {
        if (giro >= 0) {
            if (direccion == "Norte") {
                direccion = "Este";
            }
            if (direccion == "Este") {
                direccion = "Sur";
            }
            if (direccion == "Sur") {
                direccion = "Oeste";
            }
            if (direccion == "Oeste") {
                direccion = "Norte";
            }
        } else {
            if (direccion == "Norte") {
                direccion = "Oeste";
            }
            if (direccion == "Oeste") {
                direccion = "Sur";
            }
            if (direccion == "Sur") {
                direccion = "Este";
            }
            if (direccion == "Este") {
                direccion = "Norte";
            }
        }
    }

    public boolean estaArrancado() {
        return estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getX() {
        return x;
    }

    public int getE() {
        return e;
    }

    public void imprimeEstado() {
        if (this.estaArrancado()) {
            System.out.println("El vehiculo esta arrancado sus cordenadas son X: " + this.getX() + ", e: " + this.getE()
                    + " en direccion: " + this.getDireccion());
        } else {
            System.out.println("El vehiculo no esta arrancado sus cordenadas son X: " + this.getX() + ", e: "
                    + this.getE() + " en direccion: " + this.getDireccion());
        }
    }
}