import org.junit.jupiter.*;

import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.PokemonMetadata;

public class Test {
	@Test
	public void IPokemonMetadataProviderTest() {

	}
	public class IPokemonMetadataProviderFake implement IPokemonMetadataProvider{
		PokemonMetadata getPokemonMetadata(int index) throws PokedexException{
			return null;
		}
	}
}
