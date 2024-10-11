package Java.fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.PokedexException;

public class IPokemonMetadataProviderTest {

	@Test
	public void IPokemonMetadataProviderThrowsPokedexException() {
		IPokemonMetadataProvider pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		try {
			when(pokemonMetadataProvider.getPokemonMetadata(-1)).thenThrow(new PokedexException(""));
			when(pokemonMetadataProvider.getPokemonMetadata(151)).thenThrow(new PokedexException(""));
			assertThrows(PokedexException.class,() -> {
				pokemonMetadataProvider.getPokemonMetadata(-1);
		    });
			assertThrows(PokedexException.class,() -> {
				pokemonMetadataProvider.getPokemonMetadata(151);
		    });
			
			
			
			
		} catch (PokedexException e) {

		}
		

	}
}
