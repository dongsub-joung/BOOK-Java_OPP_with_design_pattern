public class Transcript {
    char rating;

    public Transcript(Student student, Course course, char rating) {
        this.rating= rating;
    }

//    sample
    public Transcript getObject(){
        return new Transcript(
                new Student("Joung DongSub", 3)
                , new Course("Java", "egoing")
                , 'A'
        );
    }
}
