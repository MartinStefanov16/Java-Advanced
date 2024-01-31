package DefiningClasses_Excercise.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public int getBadges() {
        return badges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, badges , pokemons.size());
    }

    public void putPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public boolean hasPokeWithElement(String element){
        // get list
        // get element from each poke obj
        return this.pokemons.stream()
                .map(Pokemon::getElement)
                .collect(Collectors.toList())
                .contains(element);
    }

    public void removeHealth() {
        this.pokemons.forEach(pokemon -> pokemon.setHealth(pokemon.getHealth() - 10));
    }

    public void removeDeadPokemons(){
        this.pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
    }

    public void addBadge(){
        this.badges += 1;
    }
}
