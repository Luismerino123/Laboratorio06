public class Hamburguesa {

    private Hamburguesa(){}

    private String carne;
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;
    private boolean tocino;



    public Hamburguesa(String carne) {
        this.carne = carne;
    }



    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public void setTocino(boolean tocino) {
        this.tocino = tocino;
    }
    @Override
    public String toString() {
        return "Hamburguesa{" +
                "Carne='" + carne + '\'' +
                ", Lechuga=" + lechuga +
                ", Tomate=" + tomate+
                ", Cebolla=" + cebolla +
                ", Queso=" + queso +
                ", Tocino=" + tocino +
                '}';
    }

}
