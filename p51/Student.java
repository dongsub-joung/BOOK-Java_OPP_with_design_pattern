package p51;

import java.util.Vector;

// 원래 그냥 클래스 자료형인데 record 써봄.
public record Student(Vector<Transcript> transcripts, String name) {

    public Student(Vector<Transcript> transcripts, String name) {
        this.transcripts = transcripts;
        this.name = name;
    }
    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }
}
