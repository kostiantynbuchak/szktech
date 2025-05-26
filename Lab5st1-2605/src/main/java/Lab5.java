import org.hibernate.Session;
import org.hibernate.Transaction;
import java.time.LocalDate;
import java.util.List;

public class Lab5 {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            Student s = new Student("Carson", "Alexander", "", LocalDate.parse("2022-09-01"));
            Enrollment e = new Enrollment(1, 1050, Grade.A);
            e.setStudent(s);
            s.getEnrollments().add(e);

            session.persist(s);
            session.persist(e);

            tx.commit();

            List<Student> students = session.createQuery("from Student", Student.class).list();
            students.forEach(st -> System.out.println("Student: " + st.getFirstName()));

            List<Object[]> joinResult = session.createQuery("from Student s join s.enrollments e", Object[].class).getResultList();
            joinResult.forEach(r -> System.out.println(((Student) r[0]).getFirstName() + " -> " + r[1]));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}