package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class MainTest {
    Pokedex pk = new Pokedex();
    Pokemon p = new Pokemon(0,"Jean",1,1,1,1,1,1,1,1);
    Pokemon p2 = new Pokemon(1,"Jeanne",1,1,1,1,1,1,1,1);
    PokemonMetadataProvider pokemonMetadataProvider = PokemonMetadataProvider.getProvider();
    PokemonMetadata pm = new PokemonMetadata(0,"Jean",1,1,1);
    PokemonMetadata pm2 = new PokemonMetadata(1,"jeanne",1,1,1);
    @BeforeEach
    void setup(){
        pk.addPokemon(p);
        pk.addPokemon(p2);
        PokemonMetadataProvider.addPokemonMetadata(pm);
        PokemonMetadataProvider.addPokemonMetadata(pm2);

    }
    @Test
    void ReturnValidPokemonWhenPokedexGetPokemon(){

        try {
            assertEquals(p,pk.getPokemon(0));
            assertEquals(p2,pk.getPokemon(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void ThrowExceptionPokemonWhenPokedexGetPokemon(){

        try {
            assertThrows(PokedexException.class,()->pk.getPokemon(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void ReturnMetadataWhenPokedexGetMetadata(){
        try {
            assertEquals(pm2,pk.getPokemonMetadata(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
