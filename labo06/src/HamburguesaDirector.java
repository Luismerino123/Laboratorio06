public class HamburguesaDirector {
    private  HamburguesaBuilder builder;

    public HamburguesaDirector(HamburguesaBuilder builder) {
        this.builder = builder;
    }

    public Hamburguesa hamburguesaConPollo() {
        return builder.addPollo().addLechuga().addTomate().build();
    }

    public Hamburguesa hamburguesaConTodosLosIngredientes() {
        return builder.addCarne().addTomate().addCebolla().addQueso().addTocino().build();
    }

    public Hamburguesa hamburguesaConTocino() {
        return builder.addCarne().addLechuga().addTomate().addCebolla().addQueso().addTocino().build();
    }

}
