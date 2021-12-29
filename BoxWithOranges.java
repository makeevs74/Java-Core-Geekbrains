package homeWork3.fruitBox;

public class BoxWithOranges<T extends Orange> {
    private T fruitElement;

    public BoxWithOranges(T fruitElement) {
        this.fruitElement = fruitElement;
    }

    public T getFruitElement() {
        return fruitElement;
    }

    public void setFruitElement(T fruitElement) {
        this.fruitElement = fruitElement;
    }

    public static void main(String[] args) {
        BoxWithOranges<Orange> boxWithOranges = new BoxWithOranges<>(new Orange(1))
    }
}
