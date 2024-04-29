public class Main {
    public static void main(String[] args) {
        HamburguesaBuilder builder = HamburguesaFactory.getInstance();
        HamburguesaDirector director = new HamburguesaDirector(builder);

        Hamburguesa HamburguesaConPollo = director.hamburguesaConPollo();
        System.out.println("Hamburguesa de pollo: " + HamburguesaConPollo);

        Hamburguesa HamburguesaConTodosLosIngredientes = director.hamburguesaConTodosLosIngredientes();
        System.out.println("Hamburguesa sin lechuga: " + HamburguesaConTodosLosIngredientes);

        Hamburguesa HamburguesaConTocino = director.hamburguesaConTocino();
        System.out.println("Hamburguesa con tocino LISTA: "+ HamburguesaConTocino);
    }

}