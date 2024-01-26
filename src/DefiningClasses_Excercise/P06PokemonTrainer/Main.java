package DefiningClasses_Excercise.P06PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String trainerName = input.split("\\s+")[0];
            String pokemonName = input.split("\\s+")[1];
            String pokemonElement = input.split("\\s+")[2];
            int pokemonHealth = Integer.parseInt( input.split("\\s+")[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName, pokemon));
            } else {
                trainers.get(trainerName).setPokemons(pokemon);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")){
            // check if trainers have pokemon of this type
            String element = input;

            // TODO - how does this work? document it
            trainers.values().forEach(trainer ->{

                if (trainer.pokemonWithElementExists(element)){

                }



            } );



            input = scanner.nextLine();
        }

    }
}
