import jakarta.persistence.*;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int courseId;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @ManyToOne
    private Student student;

    public Enrollment() {}

    public Enrollment(int id, int courseId, Grade grade) {
        this.id = id;
        this.courseId = courseId;
        this.grade = grade;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String toString() {
        return "Enrollment{courseId=" + courseId + ", grade=" + grade + "}";
    }
}

enum Grade {
    A, B, C, D, F
}