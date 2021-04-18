package multiple;

import java.util.*;

public class Student {
    private Vector<Transcript> transcripts;

    public Student(){
        transcripts = new Vector<>();
    }

    public void addTranscript(Transcript transcript){
        this.transcripts.add(transcript);
    }

    public void removeTranscript(Transcript transcript){
        if(this.transcripts.contains(transcript)){
            this.transcripts.remove(transcript);
        }
    }

    public Vector<Course> getCourses(){
        Vector<Course> temp = new Vector<>();
        for(Transcript transcript : this.transcripts){
            temp.add(transcript.getCourse());
        }
        return temp;
    }
}

class Transcript{
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getDate() {
        return date;
    }

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDate(int date) {
        this.date = date;
    }

    private Course course;
    private int date;
}

class Course{
    private Vector<Transcript> transcripts;

}
