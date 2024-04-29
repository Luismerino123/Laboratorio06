public class HamburguesaFactory implements HamburguesaBuilder {
    private static HamburguesaFactory instance;
    private Hamburguesa hamburguesa;

    public static HamburguesaBuilder getInstance(){
        if (instance==null){
            instance=new HamburguesaFactory();
        }
        return instance;
    }
    public HamburguesaFactory() {
        this.hamburguesa = new Hamburguesa("");
    }

    @Override
    public HamburguesaBuilder addPollo() {
        hamburguesa = new Hamburguesa("Pollo");
        return this;
    }

    @Override
    public HamburguesaBuilder addCarne() {
        hamburguesa = new Hamburguesa("Res");
        return this;
    }

    @Override
    public HamburguesaBuilder addLechuga() {
        hamburguesa.setLechuga(true);
        return this;
    }

    @Override
    public HamburguesaBuilder addTomate() {
        hamburguesa.setTomate(true);
        return this;
    }

    @Override
    public HamburguesaBuilder addCebolla() {
        hamburguesa.setCebolla(true);
        return this;
    }

    @Override
    public HamburguesaBuilder addQueso() {
        hamburguesa.setQueso(true);
        return this;
    }

    @Override
    public HamburguesaBuilder addTocino() {
        hamburguesa.setTocino(true);
        return this;
    }

    @Override
    public Hamburguesa build() {
        return  hamburguesa;
    }


}
