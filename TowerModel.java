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
        