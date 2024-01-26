package DefiningClasses_Excercise.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public boolean pokemonWithElementExists(String element) {

        // TODO - how does this work? document it
        return this.pokemons.stream()
                .map(Pokemon::getElement)
                .collect(Collectors.toList())
                .contains(element);

    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
        this.pokemons.add(pokemon);
    }
}
