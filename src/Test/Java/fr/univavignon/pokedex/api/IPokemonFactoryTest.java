package fr.univavignon.pokedex.api;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IPokemonFactoryTest {
    @Mock
    PokemonFactory pokemonFactory;

    @Test
    void ReturnPokemonClassWhenPokemonFactoryCreatePokemon(){
        when(pokemonFactory.createPokemon(1,1,1,1,1)).thenReturn(new Pokemon(1,"Jean",1,1,1,1,1,1,1,1));
        assertEquals(Pokemon.class,pokemonFactory.createPokemon(1,1,1,1,1).getClass());
    }
    @Test
    void ReturnValidPokemonWhenPokemonFactoryCreatePokemon(){
        when(pokemonFactory.createPokemon(1,1,1,1,1)).thenReturn(new Pokemon(1,"Jean",1,1,1,1,1,1,1,1));
        Pokemon P = new Pokemon(1,"Jean",1,1,1,1,1,1,1,1);

        assertEquals(P.getIndex(),pokemonFactory.createPokemon(1,1,1,1,1).getIndex());
        assertEquals(P.getName(),pokemonFactory.createPokemon(1,1,1,1,1).getName());
    }
}
