public class Coche extends Vehiculo {
    String modelo;
    String matricula;
    String color;

    public Coche() {
        modelo = "BMW";
        matricula = "GR87654";
        color = "Rojo";
    }

    public Coche(String model, String matri, String col) {
        modelo = model;
        matricula = matri;
        color = col;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimeEstado() {
        System.out.println("El modelo es " + modelo + ", matricula " + matricula + " de color " + color);
    }

    public static void main(String[] args) throws Exception {
        Coche cocheCoeta = new Coche();
        Coche cocheInes = new Coche("Fiat Panda", "GR2689CRN", "Negro");
        cocheCoeta.imprimeEstado();
        cocheInes.imprimeEstado();
    }
}