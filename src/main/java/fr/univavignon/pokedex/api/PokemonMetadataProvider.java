package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{
    static private PokemonMetadataProvider pokemonMetadataProvider;
    static private PokemonMetadata[] pokemonMetadata;
    private PokemonMetadataProvider() {
        pokemonMetadata =  new PokemonMetadata[151];
        pokemonMetadata[0] = new PokemonMetadata(0,"bob",1,1,1);
    }
    public static PokemonMetadataProvider getProvider(){
        if(pokemonMetadataProvider==null){
            pokemonMetadataProvider = new PokemonMetadataProvider();
        }
        return pokemonMetadataProvider;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if((index>=0&&index<=150) && pokemonMetadata[index] != null)
            return pokemonMetadata[index];
        else throw new PokedexException("Pokemon dont exist");
    }
    static public void addPokemonMetadata(PokemonMetadata PM){
        if(PM.getIndex()<=150){
            pokemonMetadata[PM.getIndex()]=PM;

        }
    }
}
