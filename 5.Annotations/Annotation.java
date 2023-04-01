public class Annotation {
    public static void main(String[] args) {
        Tool knife = new Tool("Knife", "Cutting");
        System.out.println(knife);
    }
}

@Author("James") // custom annotation
class Tool {
    String title;
    String purpose;

    Tool(String aTitle, String aPurpose) {
        title = aTitle;
        purpose = aPurpose;
    }

    @Override // predefined annotation
    public String toString() {
        return "This is a " + title + ", and it's meant for " + purpose;
    }
}

// creating a custom annotation
@interface Author {
    String value();
}