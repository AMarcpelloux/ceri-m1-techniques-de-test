package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class IPokedexFactoryTest {
    @Mock
    PokemonMetadataProvider pokemonMetadataProvider;
    PokemonFactory pokemonFactory;
    PokedexFactory pokedexFactory;
    @BeforeEach
    void setup(){
        pokedexFactory = Mockito.mock(PokedexFactory.class);
        pokemonMetadataProvider = Mockito.mock(PokemonMetadataProvider.class);
        pokemonFactory = Mockito.mock(PokemonFactory.class);
    }
    @Test
    void ReturnPokedexClassWhenCreatePokedex(){
        when(pokedexFactory.createPokedex(pokemonMetadataProvider,pokemonFactory)).thenReturn(new Pokedex());
        assertEquals(Pokedex.class,pokedexFactory.createPokedex(pokemonMetadataProvider,pokemonFactory).getClass());
    }
    @Test
    void ReturnPokedexWhenCreatePokedex(){
        Pokedex pokedex = new Pokedex();
        when(pokedexFactory.createPokedex(pokemonMetadataProvider,pokemonFactory)).thenReturn(pokedex);
        assertEquals(pokedex,pokedexFactory.createPokedex(pokemonMetadataProvider,pokemonFactory));
    }
}
