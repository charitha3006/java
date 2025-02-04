class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + ", Genre: " + genre + ", Published in " + getPublicationYear());
    }
}
