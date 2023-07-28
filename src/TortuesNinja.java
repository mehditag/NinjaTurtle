public class TortuesNinja {

    public static void main(String[] args) {
        Pizza.Builder builder = new Pizza.Builder("Milano");
        builder.size= Pizza.Size.GRANDE;
        builder.addIngredients(Pizza.Ingredients.FROMAGE);
        builder.addIngredients(Pizza.Ingredients.PEPPERONI);

        Pizza LeonardosPizza = builder.build();

        Pizza.Builder builder2 = new Pizza.Builder("Volcano");
        builder2.size= Pizza.Size.PETITE;
        builder2.addIngredients(Pizza.Ingredients.PEPPERONI);
        builder2.addIngredients(Pizza.Ingredients.CHAMPIGNONS);

        Pizza MichelangelosPizza = builder2.build();

        Pizza Raphaelo = new Pizza.Builder("Marguarita", Pizza.Size.PETITE,null).build();
        Pizza Donatello = new Pizza.Builder("Quattro Stiaggioni", Pizza.Size.MOYENNE, Pizza.Ingredients.FROMAGE, Pizza.Ingredients.PEPPERONI, Pizza.Ingredients.CHAMPIGNONS).build();

        System.out.println("Leonardo : "+LeonardosPizza.nom+" "+LeonardosPizza.size.nom+" "+LeonardosPizza.ingredients);
        System.out.println("Michelangelo : "+MichelangelosPizza.nom+" "+MichelangelosPizza.size.nom+" "+MichelangelosPizza.ingredients);
        System.out.println("Raphaelo : "+Raphaelo.nom+" "+Raphaelo.size.nom+" "+Raphaelo.ingredients);
        System.out.println("Donatello : "+Donatello.nom+" "+Donatello.size.nom+" "+Donatello.ingredients);

    }

}