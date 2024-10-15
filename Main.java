import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to pokemon world");
        System.out.println(" ");
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is prof Oak");
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("Let's get to know each other better");
        try {
            Thread.sleep(4000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int gender = -1;
        while (gender != 0 && gender != 1) {
            System.out.println("Are you boy or girl?");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("boy 1      girl 0");
            gender = sc.nextInt();
            sc.nextLine();

            if (gender != 0 && gender != 1) {
                System.out.println("Invalid input. Please enter 1 for boy or 0 for girl.");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        if (gender == 1) {
            System.out.println("Ok, hello " + name + "!");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Ok, hello " + name + "!");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        String[] pokemon = {"Charmander", "Squrtle", "Bulbasour"};
        int[] pokemonHealth = {20, 25, 30};
        int[] pokemonAttack = {12, 9 , 8};
        int[] pokemonExps = {0, 0, 0};
        int[] pokemonLevels = {1, 1, 1};
        int[] pokemonMaxHP = {20, 25, 30};



        int choicePoke = -1;
        while (choicePoke < 0 || choicePoke >= pokemon.length) {
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Now select your pokemon");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Charmander    1");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Squrtle       2");
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bulbasour     3");

            choicePoke = sc.nextInt() - 1; // Получаем индекс выбранного покемона

            if (choicePoke >= 0 && choicePoke < pokemon.length) {
                System.out.println("You selected: " + pokemon[choicePoke]);
                System.out.println("Health: " + pokemonHealth[choicePoke]);
                System.out.println("Attack: " + pokemonAttack[choicePoke]);
                System.out.println("Exp: " + pokemonExps[choicePoke]);
                System.out.println("Level: " + pokemonLevels[choicePoke]);
            } else {
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
            }
        }
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Now you have a pokemon, and take a pokeballs and pokedex");
        System.out.println(" ");
        int pokeballs = 5;
        int pokedex = 1;
        System.out.println("(You have "+ pokeballs+" pokeballs)");
        System.out.println(" ");

        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Have a nice advanture! Bye!");
        try {
            Thread.sleep(3000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println(" ");
        String[] wildPokemon = {"Caterpie", "Zubat", "Starmy"};
        int[] wildPokemonHealth = {4, 6, 12};
        int[] wildPokemonAttack = {2, 6 , 4};
        System.out.println(" ");
        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("(where i will go?)");


        boolean isGame = true;
        while (isGame) {
            System.out.println(pokemonHealth[choicePoke]);
            System.out.println("1) forest   2) cave   3) beach  4) rest");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("You went to forest");
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    String wildPokemonName = wildPokemon[0];
                    int wildPokemonHealths = wildPokemonHealth[0];
                    int wildPokemonAttacks = wildPokemonAttack[0];
                    boolean isBattle = true;
                    boolean isPrinted = false;

                    while (isBattle){
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        if(!isPrinted){
                            System.out.println("Oh no, there is " + wildPokemon[0] + "!");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            try {
                                Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(pokemon[choicePoke] + " go!");
                            isPrinted = true;
                        }


                        int attackChoice = -1;

                        while (attackChoice < 1 || attackChoice > 3) {
                            System.out.println("1) Scratch        2) Focus");
                            System.out.println("3) Tacle");

                            attackChoice = sc.nextInt();

                            if (attackChoice == 1) {
                                System.out.println(pokemon[choicePoke] + " used Scratch!");
                                wildPokemonHealths = wildPokemonHealths - pokemonHealth[choicePoke];
                                System.out.println(wildPokemonHealths);
                            } else if (attackChoice == 2) {
                                System.out.println(pokemon[choicePoke] + " used Focus!");
                                pokemonAttack[choicePoke] = pokemonAttack[choicePoke] + 2;
                            } else if (attackChoice == 3) {
                                System.out.println(pokemon[choicePoke] + " used Tacle!");
                                wildPokemonHealths = wildPokemonHealths - (pokemonHealth[choicePoke] - 7);
                                System.out.println(wildPokemonHealths);
                            } else {
                                System.out.println("You have not this attack");
                            }
                        }

                        if(wildPokemonHealths > 0){
                            System.out.println(wildPokemon[0] + " used Tackle");
                            pokemonHealth[choicePoke] = pokemonHealth[choicePoke] - 2;
                            System.out.println(pokemonHealth[choicePoke]);
                        } else {
                            isBattle = false;
                        }

                        if(pokemonHealth[choicePoke] <= 0){
                            isBattle = false;
                            isGame = false;
                            System.out.println("... i need run...");
                        }
                    }

                    System.out.println("Yes! " + wildPokemonName + "was beaten" );
                    pokemonExps[choicePoke] += 50;
                    System.out.println("You gained a " + pokemonExps[choicePoke] + "exp!");
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    if(pokemonExps[choicePoke] >= 100){
                        pokemonLevels[choicePoke]++;
                        pokemonHealth[choicePoke] = pokemonHealth[choicePoke] + 9;
                        pokemonMaxHP[choicePoke] = pokemonMaxHP[choicePoke] + 9;
                        pokemonAttack[choicePoke] += 3;
                        pokemonExps[choicePoke] =  pokemonExps[choicePoke] % 100;
                        System.out.println("Pokemon level raised " + pokemonLevels[choicePoke] + "!");
                    }
                    try {
                        Thread.sleep(3000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("You went to cave");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    String wildPokemonName1 = wildPokemon[1];
                    int wildPokemonHealths1 = wildPokemonHealth[1];
                    int wildPokemonAttacks1 = wildPokemonAttack[1];
                    boolean isBattle1 = true;
                    boolean isPrinted1 = false;

                    while (isBattle1){
                        if(!isPrinted1){
                            System.out.println("Oh no, there is " + wildPokemon[1] + "!");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            try {
                                Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(pokemon[choicePoke] + " go!");
                            isPrinted1 = true;
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        };
                        try {
                            Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }








                        int attackChoice = -1;

                        while (attackChoice < 1 || attackChoice > 3) {
                            System.out.println("1) Scratch        2) Focus");
                            System.out.println("3) Tacle");

                            attackChoice = sc.nextInt();

                            if (attackChoice == 1) {

                                System.out.println(pokemon[choicePoke] + " used Scratch!");
                                wildPokemonHealths1 = wildPokemonHealths1 - pokemonHealth[choicePoke];
                                System.out.println(wildPokemonHealths1);
                            } else if (attackChoice == 2) {
                                System.out.println(pokemon[choicePoke] + " used Focus!");
                                pokemonAttack[choicePoke] = pokemonAttack[choicePoke] + 2;
                            } else if (attackChoice == 3) {
                                System.out.println(pokemon[choicePoke] + " used Tacle!");
                                wildPokemonHealths1 = wildPokemonHealths1 - (pokemonHealth[choicePoke] - 7);
                                System.out.println(wildPokemonHealths1);
                            } else {
                                System.out.println("You have not this attack");
                            }
                        }

                        if(wildPokemonHealths1 > 0){
                            try {
                                Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(wildPokemon[1] + " used Tackle");
                            pokemonHealth[choicePoke] = pokemonHealth[choicePoke] - 2;
                            System.out.println(pokemonHealth[choicePoke]);
                        } else {
                            isBattle1 = false;
                        }

                        if(pokemonHealth[choicePoke] <= 0){
                            isBattle1 = false;
                            isGame = false;
                            System.out.println("... i need run...");
                        }
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Yes! " + wildPokemonName1 + "was beaten" );
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pokemonExps[choicePoke] += 50;
                    System.out.println("You gained a " + pokemonExps[choicePoke] + "exp!");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");

                    if(pokemonExps[choicePoke] >= 100){
                        pokemonLevels[choicePoke]++;
                        pokemonHealth[choicePoke] = pokemonHealth[choicePoke] + 9;
                        pokemonMaxHP[choicePoke] = pokemonMaxHP[choicePoke] + 9;
                        pokemonAttack[choicePoke] += 3;
                        pokemonExps[choicePoke] =  pokemonExps[choicePoke] % 100;
                        System.out.println("Pokemon level raised " + pokemonLevels[choicePoke] + "!");
                    }
                    try {
                        Thread.sleep(3000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 3:

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("You went to beach");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    String starmy = wildPokemon[2];
                    int starmyHealth = wildPokemonHealth[2];
                    int starmyAttacks = wildPokemonAttack[2];
                    boolean isBattle2 = true;
                    boolean isPrinted2 = false;
                    while (isBattle2){
                        if(!isPrinted2){
                            System.out.println("Oh no, there is " + starmy + "!");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            try {
                                Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(pokemon[choicePoke] + " go!");
                            isPrinted2 = true;
                        }


                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }




                        int attackChoice = -1;

                        while (attackChoice < 1 || attackChoice > 3) {
                            System.out.println("1) Scratch        2) Focus");
                            System.out.println("3) Tacle");
                            try {
                                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            attackChoice = sc.nextInt();

                            if (attackChoice == 1) {

                                System.out.println(pokemon[choicePoke] + " used Scratch!");
                                starmyHealth = starmyHealth - pokemonHealth[choicePoke];
                                System.out.println(starmyHealth);
                            } else if (attackChoice == 2) {
                                System.out.println(pokemon[choicePoke] + " used Focus!");
                                pokemonAttack[choicePoke] = pokemonAttack[choicePoke] + 2;
                            } else if (attackChoice == 3) {
                                System.out.println(pokemon[choicePoke] + " used Tacle!");
                                starmyHealth = starmyHealth - (pokemonHealth[choicePoke] - 7);
                                System.out.println(starmyHealth);
                            } else {
                                System.out.println("You have not this attack");
                            }
                        }
                        try {
                            Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(starmyHealth > 0){
                            try {
                                Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            try {
                                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(starmy + " used Tackle");
                            pokemonHealth[choicePoke] = pokemonHealth[choicePoke] - 2;
                            System.out.println(pokemonHealth[choicePoke]);
                        } else {
                            isBattle2 = false;
                        }

                        if(pokemonHealth[choicePoke] <= 0){
                            isBattle2 = false;
                            isGame = false;
                            System.out.println("... i need run...");
                        }
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Yes! " + starmy + "was beaten" );
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pokemonExps[choicePoke] += 50;
                    System.out.println("You gained a " + pokemonExps[choicePoke] + "exp!");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");

                    if(pokemonExps[choicePoke] >= 100){
                        pokemonLevels[choicePoke]++;
                        pokemonHealth[choicePoke] = pokemonHealth[choicePoke] + 9;
                        pokemonMaxHP[choicePoke] = pokemonMaxHP[choicePoke] + 9;
                        pokemonAttack[choicePoke] += 3;
                        pokemonExps[choicePoke] =  pokemonExps[choicePoke] % 100;
                        System.out.println("Pokemon level raised " + pokemonLevels[choicePoke] + "!");
                    }
                    try {
                        Thread.sleep(3000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Pokemon health full");
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pokemonHealth[choicePoke] = pokemonHealth[choicePoke] + 21;
                    if (pokemonHealth[choicePoke] > pokemonMaxHP[choicePoke]) {
                        pokemonHealth[choicePoke] = pokemonMaxHP[choicePoke];
                    }
                    try {
                        Thread.sleep(2000); // Pause for 1 second (1000 milliseconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(" ");
                    System.out.println(" ");

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("I can go only to this places");
            }
        }


    }
}
