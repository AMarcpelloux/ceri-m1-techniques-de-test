package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex{
    ArrayList<Pokemon> PokemonList;
    PokemonMetadataProvider pokemonMetadataProvider;
    int index;
    public Pokedex(){
        pokemonMetadataProvider = PokemonMetadataProvider.getProvider();
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
       if(PokemonList.size()>id){
           return PokemonList.get(id);
       }
      else{
          throw new PokedexException("non-existant");
       }
    }

    @Override
    public List<Pokemon> getPokemons() {
        return PokemonList;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return PokemonList;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if(PokemonList.size()>index){
            return pokemonMetadataProvider.getPokemonMetadata(PokemonList.get(index).getIndex());
        }
        else{
            throw new PokedexException("non-existant metadata");
        }
    }
}
