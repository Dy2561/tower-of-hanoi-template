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
        
        