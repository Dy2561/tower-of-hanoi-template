public class TowerModel {

    private IntegerStack[] towers;
    private int height;
    private int moveCounter = 0;

    public TowerModel(int height) {
        this.height = height;
        towers = new IntegerStack[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new IntegerStack(height);
        }
        for (int i = height; i > 0; i--) {
            towers[0].push(i);
        }
    }

    public int getHeight() {
        return height;
    }

    public IntegerStack[] getTowers() {
        return towers;
    }

    public void move(int source, int destination) {
        System.out.println("Move #" + ++moveCounter + " from " + source + " to " + destination);
        
        IntegerStack sourceTower = towers[source];
        IntegerStack destinationTower = towers[destination];
        
        int sourceDisk = sourceTower.peek();
        int destinationDisk = destinationTower.peek();
        
        if (sourceDisk != 0) {
            if (destinationDisk == 0 || sourceDisk < destinationDisk) {
                int disk = sourceTower.pop();
                destinationTower.push(disk);
                System.out.println("Moved disk " + disk + " from tower " + source + " to tower " + destination);
            } else {
                System.out.println("Invalid move: Cannot place disk " + sourceDisk + " on disk " + destinationDisk);
            }
        } else {
            System.out.println("Invalid move: Source tower is empty.");
        }
    }
}