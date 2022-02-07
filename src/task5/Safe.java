package task5;

public class Safe {
    private  int capacity;

    public Safe(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "capacity=" + capacity +
                '}';
    }
}
