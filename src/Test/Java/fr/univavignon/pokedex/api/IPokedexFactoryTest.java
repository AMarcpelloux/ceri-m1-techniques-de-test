package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class IPokedexFactoryTest {
    PokedexFactory pokedexFactory;
    @Mock
    PokemonMetadataProvider pokemonMetadataProvider;
    PokemonFactory pokemonFactory;
    @BeforeEach
    void setup(){
        pokedexFactory = new PokedexFactory();
        pokemonMetadataProvider = Mockito.mock(PokemonMetadataProvider.class);
        pokemonFactory = Mockito.mock(PokemonFactory.class);
    }
    @Test
    void ReturnPokedexClassWhenCreatePokedex(){
        assertEquals(Pokedex.class,pokedexFactory.createPokedex(pokemonMetadataProvider,pokemonFactory).getClass());
    }
}
