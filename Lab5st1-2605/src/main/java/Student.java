import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String middleName;

    private LocalDate enrollmentDate;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enrollment> enrollments = new ArrayList<>();

    public Student() {}

    public Student(String firstName, String lastName, String middleName, LocalDate enrollmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.enrollmentDate = enrollmentDate;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public String getFirstName() {
        return firstName;
    }
}