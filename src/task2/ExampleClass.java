package task2;

public class ExampleClass<E extends Number> {
    private String name;
    private E num;
    private boolean isUsed;

    public ExampleClass() {
    }

    public ExampleClass(String name, E num, boolean isUsed) {
        this.name = name;
        this.num = num;
        this.isUsed = isUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getNum() {
        return num;
    }

    public void setNum(E num) {
        this.num = num;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }


    @Override
    public String toString() {
        return "ExampleClass{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", isUsed=" + isUsed +
                '}';
    }
}
