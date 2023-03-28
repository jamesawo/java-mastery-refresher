public class MultipleTypeExample {
    public static void main(String[] args) {
        ToolBox<Integer, String> toolBox = new ToolBox<>();
        toolBox.setNameOfToolSet("Screwdrivers");
        toolBox.setNumberOfItems(12);

        System.out.printf("Toolbox contains %d types of %s \n", toolBox.getNumberOfItems(), toolBox.getNameOfToolSet());
    }
}

// MultipleType Parameter
class ToolBox<T, S> {
    private T numberOfItems;
    private S nameOfToolSet;

    public T getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(T numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public S getNameOfToolSet() {
        return nameOfToolSet;
    }

    public void setNameOfToolSet(S nameOfToolSet) {
        this.nameOfToolSet = nameOfToolSet;
    }

}