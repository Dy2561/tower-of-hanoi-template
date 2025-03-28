public class Main {

    public static void main(String[] args) {
        TowerModel model = new TowerModel(3);
        TowerSolver solver = new TowerSolver();
        solver.solve(model);

        TestSuite test = new TestSuite();
        test.run();
    }
}