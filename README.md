# Assignment 2: Factory Method & Abstract Factory

## Theme: Reading Room

A small application about books and how people read them.

Part A (Factory Method): creating a single book by genre.
Part B (Abstract Factory): creating a consistent format for a book - content, bookmark, and reading device that all belong to the same format (paper, ebook, or audiobook). Formats cannot be mixed: a bookmark that is a timestamp makes no sense for a paper book, and a bookmark that is a page number makes no sense for an audiobook.

## Repository structure

assignment2-design-patterns

- src/main/java
- factorymethod (Part A)
- abstractfactory (Part B)
- pom.xml
- README.md

## Part A - Factory Method

Problem: creating a Book object directly with new FantasyBook() (or similar) hard-codes the concrete class in client code. Adding a new genre would mean editing that client code.

Solution: the client depends only on the abstract creator BookRecommender. Each concrete creator subclass decides which concrete Book to instantiate.

- Product: Book
- ConcreteProduct: FantasyBook, DetectiveBook, SciFiBook
- Creator: BookRecommender (abstract)
- ConcreteCreator: FantasyRecommender, DetectiveRecommender, SciFiRecommender
- Client: FactoryMethodDemo

BookRecommender.recommend() is the business method: it calls the factory method createBook() and then uses the result only through the Book interface. The client (FactoryMethodDemo) never calls new FantasyBook(), new DetectiveBook(), or new SciFiBook() - only new FantasyRecommender() and similar, once per genre.

## Part B - Abstract Factory

Problem: a book's content, bookmark, and reading device must all belong to the same format. Nothing stops client code from mixing a paper bookmark with audiobook content by mistake if they are created separately.

Solution: one factory per format creates all three related products together, so an inconsistent combination is impossible.

- AbstractProduct: Content, Bookmark, ReadingDevice
- ConcreteProduct: Paper*, Ebook*, Audiobook* (3 each)
- AbstractFactory: BookFormatFactory
- ConcreteFactory: PaperFactory, EbookFactory, AudiobookFactory
- Client: LibraryShelf, AbstractFactoryDemo

LibraryShelf receives a BookFormatFactory through its constructor (composition) and only ever calls methods on Content, Bookmark, and ReadingDevice - it never mentions a concrete class. The format is chosen in exactly one place: the array of factories built in AbstractFactoryDemo.main().

## Why two different patterns

Factory Method creates one product and relies on inheritance: a subclass overrides createBook().
Abstract Factory creates a family of products and relies on composition: LibraryShelf is handed a factory object, it does not extend anything.
Part B could not be replaced by three separate Factory Methods, because nothing would then guarantee that the Content, Bookmark, and ReadingDevice handed to a client all belong to the same format. The whole point of Abstract Factory is that guarantee, plus the ability to switch the entire family by swapping one factory object.

## How to run

Run FactoryMethodDemo or AbstractFactoryDemo directly from the IDE.