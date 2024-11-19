package taller3.televisores;

public class TV {
    private static int numTV = 0;
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.canal = 1;
        this.precio = 500;
        this.estado = estado;
        this.volumen = 1;
        this.control = null;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCanal(int canal) {
        if (estado && 1 <= canal && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setVolumen(int volumen) {
        if (estado && 0 <= volumen && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }
}