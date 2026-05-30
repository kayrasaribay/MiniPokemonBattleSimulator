package pokemonbattle.model;

public class Move {
    private String name;
    private PokemonType type;
    private int power;
    private int accuracy;

    public Move(String name, PokemonType type, int power, int accuracy){
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }
    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }
    @Override
    public String toString() {
        return name + " | Type: " + type + " | Power: " + power + " | Accuracy: " + accuracy + "%";
    }
}
