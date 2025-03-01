package other_class;

public class Balance {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public void result() {
        if (leftWeight == rightWeight) {
            System.out.println("=");
        } else if (rightWeight > leftWeight) {
            System.out.println("R");
        } else {
            System.out.println("L");
        }
    }
}