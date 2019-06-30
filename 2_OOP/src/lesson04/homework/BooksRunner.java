package lesson04.homework;

public class BooksRunner {
    public static void main(String [] args) {
        Book book1 = new Book("Собачье сердце", "Михаил Булгаков", "Издательство", "Твердый переплет", 001, 1987, 2000, 4.50);
        Book book2 = new Book("Этюд в багровых тонах", "Артур Конан Дойл", "Издательство", "Твердый переплет", 002, 1887, 460, 10.50);
        Book book3 = new Book("Бесы", "Федор Достоевский", "Издательство", "Твердый переплет", 003, 1872, 460, 12.50);
        Book book4 = new Book("Братья Карамазовы", "Федор Достоевский", "Издательство", "Твердый переплет", 004, 1880, 750, 12.50);
        Book book5 = new Book("50 оттенков серого", "Эрика Леонард", "Издательство", "Твердый переплет", 005, 2011, 750, 59.99);

        Books books = new Books();
//        books.infoMethod(book2.getTitleOfBook());
//        books.infoMethod();

        // ОСТАНОВИЛСЯ ТУТ

    }
}