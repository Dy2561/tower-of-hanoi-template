public class TowerSolver {
    private TowerModel model;

    public TowerSolver() {
    }

    public void solve(TowerModel model) {
        this.model = model;
        solveRecursive(model.getHeight(), 0, 2, 1);
    }

    private void solveRecursive(int n, int source, int destination, int auxiliary) {
        if (n == 1) {
            model.move(source, destination);
        } else {
            solveRecursive(n - 1, source, auxiliary, destination);
            model.move(source, destination);
            solveRecursive(n - 1, auxiliary, destination, source);
        }
    }
}