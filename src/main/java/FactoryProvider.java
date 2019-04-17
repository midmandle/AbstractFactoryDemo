public class FactoryProvider {
    public static MazeFactory getFactory(String mazeType) {
        switch(mazeType){
            case "Enchanted":
                return new EnchantedMazeFactory();
            default:
                return new StandardMazeFactory();
        }
    }
}
