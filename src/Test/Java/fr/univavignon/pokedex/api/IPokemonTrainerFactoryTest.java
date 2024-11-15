package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IPokemonTrainerFactoryTest {
    @Mock
    IPokemonTrainerFactory pokemonTrainerFactory;
    IPokedexFactory pokedexFactory;
    IPokedex pokedex;
    @Test
    void WhenCreateTrainerReturnTrainerClass(){
        when(pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory)).thenReturn(new PokemonTrainer("Jean",Team.MYSTIC,pokedex));
        assertEquals(PokemonTrainer.class,pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory).getClass());
    }
    @Test
    void ReturnedTrainerIsGood(){
        when(pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory)).thenReturn(new PokemonTrainer("Jean",Team.MYSTIC,pokedex));
        PokemonTrainer pt = pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory);
        assertEquals(pt.getName(),pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory).getName());
        assertEquals(pt.getPokedex(),pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory).getPokedex());
        assertEquals(pt.getTeam(),pokemonTrainerFactory.createTrainer("Jean",Team.MYSTIC,pokedexFactory).getTeam());
    }
}
