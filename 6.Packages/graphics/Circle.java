package graphics;

public class Circle extends Graphic implements Draggable {

    @Override
    public void drag() {
        System.out.println("Dragging...");
    }

}
