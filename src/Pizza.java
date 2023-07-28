import java.util.ArrayList;

public class Pizza {

    String nom;
    Size size;

    ArrayList<Ingredients> ingredients;


    private Pizza(Builder builder) {
        this.nom = builder.nom;
        this.size = builder.size;
        this.ingredients = builder.ingredients;
    }


    public static class Builder {

        public String nom;
        public Size size;
        public ArrayList<Ingredients> ingredients;

        Builder(String nom){
            this.nom=nom;
        }

        Builder(String nom, Size size, Ingredients... ingredients){
            this.nom = nom;
            this.size(size);
            if(ingredients!=null){
                for (Ingredients ingredient : ingredients){
                    this.addIngredients(ingredient);
                }
            }
        }


        public void size(Size size){
            this.size=size;
        }

        public void addIngredients(Ingredients ingredient){
            if (this.ingredients==null){
                this.ingredients= new ArrayList<>();
            }
            this.ingredients.add(ingredient);
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    public enum Size {
        GRANDE("Grande Pizza"),
        PETITE("Petite Pïzza"),
        MOYENNE("Moyenne Pizza");

        String nom;
        Size(String nom){
            this.nom=nom;
        }
    }

    public enum Ingredients{
        PEPPERONI,
        CHAMPIGNONS,
        FROMAGE;
    }
}