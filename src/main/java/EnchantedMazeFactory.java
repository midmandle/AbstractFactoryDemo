public class EnchantedMazeFactory implements MazeFactory {
    @Override
    public MazeDoor makeDoor() {
        return new EnchantedDoor();
    }

    @Override
    public MazeRoom makeRoom() {
        return new EnchantedRoom();
    }
}
