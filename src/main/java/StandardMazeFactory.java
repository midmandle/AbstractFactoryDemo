public class StandardMazeFactory implements MazeFactory {
    @Override
    public MazeDoor makeDoor() {
        return new StandardDoor();
    }

    @Override
    public MazeRoom makeRoom() {
        return new StandardRoom();
    }
}
