package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.concurrent.ExecutionException;

import static org.mockito.Mockito.*;

public class  IPokemonMetadataProviderTest {
    private PokemonMetadataProvider PMP;
    @BeforeEach
    void setup(){
        this.PMP = Mockito.mock(PokemonMetadataProvider.class);
    }
    @Test
    void IfPokemonMetadataNullThrowException(){
        try {
            when(PMP.getPokemonMetadata(8)).thenThrow(new PokedexException(""));
            assertThrows(PokedexException.class,() -> PMP.getPokemonMetadata(8));
        } catch (Exception e) {

        }
    }
    @Test
    void IfPokemonMetadataOutOfBoundThrowException(){
        try {
            when(PMP.getPokemonMetadata(888)).thenThrow(new PokedexException(""));
            assertThrows(PokedexException.class,() -> PMP.getPokemonMetadata(888));
            when(PMP.getPokemonMetadata(-10)).thenThrow(new PokedexException(""));
            assertThrows(PokedexException.class,() -> PMP.getPokemonMetadata(-10));
        } catch (Exception e) {

        }
    }
    @Test
    void IfPokemonMetadataValidGetPokemonMetadata() {
        try {
            final int i = 1;
            final String s = "pokemon";
            PokemonMetadata PM = new PokemonMetadata(i,s,i,i,i);
            when(PMP.getPokemonMetadata(1)).thenReturn(new PokemonMetadata(i,s,i,i,i));
            assertEquals(PM.getIndex(),PMP.getPokemonMetadata(1).getIndex());
            assertEquals(PM.getName(),PMP.getPokemonMetadata(1).getName());
        } catch (Exception e) {

        }


    }
}
