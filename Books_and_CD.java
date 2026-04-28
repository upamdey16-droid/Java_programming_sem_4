abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        this.product_id = id;
    }

    abstract void display();
}

class Book extends AbstractProduct {
    String title;

    Book(int id, String title) {
        super(id);
        this.title = title;
    }

    void display() {
        System.out.println("Book ID: " + product_id + ", Title: " + title);
    }
}

class CD extends AbstractProduct {
    String artist;

    CD(int id, String artist) {
        super(id);
        this.artist = artist;
    }

    void display() {
        System.out.println("CD ID: " + product_id + ", Artist: " + artist);
    }
}

public class Books_and_CD {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new Book(1, "Travel Guide");
        p.display();

        p = new CD(2, "Arijit Singh");
        p.display();
    }
}