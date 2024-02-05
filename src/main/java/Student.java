import jakarta.persistence.*;

@Entity
public class Student {

    private Integer id;
    private String name;
    private long rollNo;
    private String qualification;
    private String course;
    private int year;

    private String hallTicker;

    public Student() {
    }

    public Student(Integer id, String name, long rollNo, String qualification, String course, int year, String hallTicker) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.qualification = qualification;
        this.course = course;
        this.year = year;
        this.hallTicker = hallTicker;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHallTicker() {
        return hallTicker;
    }

    public void setHallTicker(String hallTicker) {
        this.hallTicker = hallTicker;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", qualification='" + qualification + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                ", hallTicker='" + hallTicker + '\'' +
                '}';
    }
}
