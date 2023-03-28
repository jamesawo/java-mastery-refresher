public class RawTypeExample {

    public static void main(String[] args) {

        /*
         * If the actual type argument is omitted,
         * you create a raw type of ItemBox<T>:
         */

        ItemBox itemBox = new ItemBox();
        itemBox.setItem("Cake gift box.");

        System.out.println(itemBox);
    }

}

class ItemBox<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "I am a " + item.toString();
    }
}