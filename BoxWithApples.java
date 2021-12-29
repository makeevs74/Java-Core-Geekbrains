package homeWork3.fruitBox;

public class BoxWithApples<T extends Apple> {
    private T[] fruitElement;

    public BoxWithApples(T[] fruitElement) {
        this.fruitElement = fruitElement;
    }

    public T[] getFruitElement() {
        return fruitElement;
    }

    public void setFruitElement(T[] fruitElement) {
        this.fruitElement = fruitElement;
    }

    public static void main(String[] args) {
        BoxWithApples<Apple> fruitBox = new BoxWithApples<T>(2, 2, 1.9, 1.5, 1.1);

    }
}
