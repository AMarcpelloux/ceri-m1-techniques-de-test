package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex{
    ArrayList<Pokemon> PokemonList;
    int index;
    public Pokedex(){
        PokemonList = new ArrayList<Pokemon>();
        index = 0;
    }
    @Override
    public int size() {
        return index;
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        PokemonList.add(pokemon);
        index++;
        return index;
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return null;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}
