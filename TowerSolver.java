public void solve(TowerModel model) {
    this.model = model;
    solveRecursive(model.height(), 0, 2, 1);
}

private void solveRecursive(int n, int source, int destination, int auxiliary) {
    if (n == 1) {
        model.move(source, destination);
    } else {
        
    }
}