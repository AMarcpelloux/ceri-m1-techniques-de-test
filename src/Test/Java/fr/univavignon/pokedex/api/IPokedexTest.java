package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IPokedexTest {
    Pokemon P;
    @Mock
    IPokedex pokedex;
    Pokedex pkd;
    @BeforeEach
    void setup(){
        P = new Pokemon(1,"",1,1,1,1,1,1,1,1);
        pkd = new Pokedex();
    }
    @Test
    void ReturnSizeOfPokedex(){
        when(pokedex.size()).thenReturn(69);
        assertEquals(69,pokedex.size());
    }

    @Test
    void ReturnIndexOfAddedPokemonOnPokedex(){

        when(pokedex.addPokemon(P)).thenReturn(70);
        assertEquals(70,pokedex.addPokemon(P));
    }

    @Test
    void ThrowPokedexExceptionWhenGetPokemonOfPokedex(){
        try {
            when(pokedex.getPokemon(70)).thenThrow(new PokedexException(""));
            assertThrows(PokedexException.class,() -> pokedex.getPokemon(70));
        } catch (Exception e) {

        }

    }

    @Test
    void ReturnPokemonOfPokedex(){

        try {
            when(pokedex.getPokemon(1)).thenReturn(P);
            assertEquals(P,pokedex.getPokemon(1));
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void ReturnListPokemonOfPokedex(){
        ArrayList<Pokemon> pokemonList;
        pkd.addPokemon(P);
        pokemonList = (ArrayList<Pokemon>) pkd.getPokemons();
        assertEquals(pokemonList,pokedex.getPokemons());

    }
    @Test
    void ReturnSortedListPokemonOfPokedex(){
        ArrayList<Pokemon> pokemonList;
        pkd.addPokemon(P);
        pokemonList = (ArrayList<Pokemon>) pkd.getPokemons(PokemonComparators.NAME);
        assertEquals(pokemonList,pokedex.getPokemons(PokemonComparators.NAME));

    }
    @Test
    void TestGetPokemonAtIndex(){
        pkd.addPokemon(P);
        try {
            assertEquals(P,pkd.getPokemon(0));
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void TestCreatePokemon(){
        //yodo
    }


    @Test
    void TestThrowsExceptionWhenGetMetadata(){
        try {
            assertThrows(PokedexException.class,() -> pkd.getPokemonMetadata(999));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
