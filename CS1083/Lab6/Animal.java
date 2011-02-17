public abstract class Animal {
    String  species;

    public Animal()
    {
        species = "";
    }

    public Animal(String s)
    {
        species = s;
    }

    public abstract String eats();

    public abstract int dailyFood();

}