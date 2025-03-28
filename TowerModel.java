public void move(int source, int destination) {
    System.out.println("Move #" + ++moveCounter + " from " + source + " to " + destination);
    
    IntegerStack sourceTower = towers[source];
    IntegerStack destinationTower = towers[destination];
    
    int sourceDisk = sourceTower.peek();
    int destinationDisk = destinationTower.peek();
    
   