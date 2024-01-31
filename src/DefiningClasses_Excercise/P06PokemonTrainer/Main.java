package DefiningClasses_Excercise.P06PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            //"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}"
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            // create trainer and pokemon
            // add poke to trainer
            // add trainer to Map

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);



            if (!trainers.containsKey(trainerName)) {
                // no trainer
                trainers.put(trainerName, trainer);
                trainer.putPokemon(pokemon);
            } else {
                trainers.get(trainerName).putPokemon(pokemon);
            }



            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")){
            String element = input;

            // check if trainer has poke with the element


            trainers.entrySet().stream()
                    .forEach(trainer ->{

                        if (trainer.getValue().hasPokeWithElement(element)){
                            // when yes, +1 badge
                            trainer.getValue().addBadge();
                        } else {
                            // when no, -10hp on all pokemons
                            trainer.getValue().removeHealth();
                        }
                        trainer.getValue().removeDeadPokemons();

                    });


            // remove killed pokemons

            input = scanner.nextLine();
        }
        trainers.values().stream()
                .sorted((t1,t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(System.out::println);






    }
}
