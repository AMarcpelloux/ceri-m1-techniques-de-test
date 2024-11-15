package fr.univavignon.pokedex.api;

public class main {

    public static void main(String[] args){
        Pokemon pk = new Pokemon(0,"bob",0,0,0,0,0,0,0,0);
        Pokedex pkd = new Pokedex();
        pkd.addPokemon(pk);
        pkd.addPokemon(pk);
        pkd.addPokemon(pk);
        pkd.addPokemon(pk);
        pkd.addPokemon(pk);
        pkd.addPokemon(pk);
        try {
            pkd.getPokemon(0);
            pkd.getPokemons();
            pkd.getPokemons(PokemonComparators.NAME);
            pkd.getPokemonMetadata(0);
            pkd.size();

        } catch (PokedexException e) {
            System.out.println(e.getMessage());
        }
    }
}
