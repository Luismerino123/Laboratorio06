public interface HamburguesaBuilder {
    HamburguesaBuilder addPollo();
    HamburguesaBuilder addCarne();
    HamburguesaBuilder addLechuga();
    HamburguesaBuilder addTomate();
    HamburguesaBuilder addCebolla();
    HamburguesaBuilder addQueso();
    HamburguesaBuilder addTocino();
    Hamburguesa build();

}
