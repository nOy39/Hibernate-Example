package reports;


import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Reports {

/*    public List<ExamResult> getExamResults(String firstName, String lastName, Session session) {
        String query = "select new reports.ExamResult(s.lastName, sj.name, e.grade) " +
                " from Exams e, Student s, Subject sj " +
                "where e.student.id = s.id and e.subject.id = sj.id " +
                "and s.firstName = :firstName and s.lastName = :lastName";

        Query hibernateQuerry = session.createQuery(query);
        hibernateQuerry.setParameter("firstName", firstName);
        hibernateQuerry.setParameter("lastName", lastName);

        return hibernateQuerry.getResultList();

    }
*/
    public List<ExamResult> getExamResultsLights(String firstName, String lastName, Session session) {
        String query = "select new reports.ExamResult(e.student.lastName, e.subject.name, e.grade) " +
                "from Exams e " +
                "where e.student.firstName = :firstName and e.subject.name = :lastName";

        Query hibernateQuerry = session.createQuery(query);
        hibernateQuerry.setParameter("firstName", firstName);
        hibernateQuerry.setParameter("lastName", lastName);

        return hibernateQuerry.getResultList();

    }
}
