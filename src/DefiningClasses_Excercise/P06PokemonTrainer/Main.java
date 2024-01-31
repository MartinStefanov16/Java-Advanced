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




            input = scanner.nextLine();
        }





    }
}
