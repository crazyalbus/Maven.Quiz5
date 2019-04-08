package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable<Student>{
    private Integer id;
    private Double totalStudyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.totalStudyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return this.toString().compareTo(o.toString());
    }
}
