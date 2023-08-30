public abstract class Figura {
    private String colorDeFondo;

    public String getColorDeFondo() {
        return colorDeFondo;
    }

    public void setColorDeFondo(String colorDeFondo) {
        this.colorDeFondo = colorDeFondo;
    }

    public abstract double calcularArea();
}
