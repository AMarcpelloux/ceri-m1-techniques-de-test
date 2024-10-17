package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{
    static private PokemonMetadataProvider pokemonMetadataProvider;
    static private PokemonMetadata[] pokemonMetadata;
    static private int id;
    private PokemonMetadataProvider() {
        id = 0;
        pokemonMetadata =  new PokemonMetadata[151];
    }
    public static PokemonMetadataProvider getProvider(){
        if(pokemonMetadataProvider==null){
            pokemonMetadataProvider = new PokemonMetadataProvider();
        }
        return pokemonMetadataProvider;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if((id>0&&id<=150) && pokemonMetadata[index] != null)
            return pokemonMetadata[index];
        else throw new PokedexException("Pokemon dont exist");
    }
    static public void addPokemonMetadata(PokemonMetadata PM){
        if(id<=150){
            pokemonMetadata[id]=PM;
            id++;
        }
    }
}
