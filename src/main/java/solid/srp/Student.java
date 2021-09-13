package solid.srp;

/*
현재 학생 클래스는 많은 책임을 수행하고 있다.
수강 과목 추가, 조회만 해도 충분하다.
데이터베이스 관련 로직은 다른 클래스에서 해도 된다.
 */

/*
책임이 많을 수록 변경할 이유가 많아진다.
 */

public class Student {
    public void getCourses() { }
//    public void addCourse(Course c) { }
    public void save() { }
//    public Student load() { }
    public void printOnReport() { }
    public void printOnAttendanceBook() { }
}
