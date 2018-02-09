import entity.Exams;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Student student;


        /**
         * * Вставить запись в базу!!!
         *
         * Student student = new Student();
         * student.setFirstName("John");
         * student.setLastName("Wayne");
         * student.setAge(25);
         *
         * session.save(student);
         *
         * transaction.commit();
        */

        /** Получить данные из БД;
         *
         * Student student = session.get(Student.class,3); !!!Syntax session.get(<Название класса Entity>,<id>)
         * System.out.println(student);
         */

        /** Изменил данные в БД;
         *
         * student = session.get(Student.class,4);
         * student.setAge(40);
         * transaction.commit();
         */
        student = session.get(Student.class,1);
        Set<Exams> exams = student.getExams();

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
