class NonFictionBook extends Book {
    private String fieldOfStudy;

    public NonFictionBook(String title, String author, int publicationYear, String fieldOfStudy) {
        super(title, author, publicationYear);
        this.fieldOfStudy = fieldOfStudy;
    }

    // Getter and Setter for fieldOfStudy
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + ", Field of Study: " + fieldOfStudy + ", Published in " + getPublicationYear());
    }
}
