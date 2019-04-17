import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MazeFactoryShould {
    @Test
    public void return_a_Standard_door() {
        MazeFactory mazeFactory = FactoryProvider.getFactory("Standard");
        MazeDoor door = mazeFactory.makeDoor();
        assertEquals("A Standard Door", door.inspect());
    }

    @Test
    public void return_a_Standard_room() {
        MazeFactory mazeFactory = FactoryProvider.getFactory("Standard");
        MazeRoom room = mazeFactory.makeRoom();
        assertEquals("A Standard Room", room.inspect());
    }

    @Test
    public void return_an_Enchanted_door() {
        MazeFactory mazeFactory = FactoryProvider.getFactory("Enchanted");
        MazeDoor door = mazeFactory.makeDoor();
        assertEquals("An Enchanted Door", door.inspect());
    }

    @Test
    public void return_an_Enchanted_room() {
        MazeFactory mazeFactory = FactoryProvider.getFactory("Enchanted");
        MazeRoom room = mazeFactory.makeRoom();
        assertEquals("An Enchanted Room", room.inspect());
    }
}
