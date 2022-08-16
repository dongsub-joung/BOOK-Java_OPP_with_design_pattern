package p51;

import java.util.Vector;

public class Course {
    private Vector<Transcript> transcripts;
    private String name;

    public Course(String name) {
        this.name = name;
        transcripts= new Vector<Transcript>();
    }

    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }
}
