package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Cris","Kempel");
        Author author2 = new Author("Jordan", "Miller");
        Book book1 = new Book("Java for beginners",author1,2002);
        Book book2 = new Book("How to be happy in life", author2, 2009);
        System.out.println(" Название " + book1.getTitle() + " Автор " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + " Год " + book1.getYear());
        book1.setYear(-1);
        System.out.println(" Название " + book1.getTitle() + " Автор " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + " Год " + book1.getYear());
        book1.setYear(500);
        System.out.println(" Название " + book1.getTitle() + " Автор " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + " Год " + book1.getYear());
        book2.setYear(2015);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

    }
    }

