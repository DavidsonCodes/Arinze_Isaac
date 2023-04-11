package entities;

public class Applicant {

    private String name;
    private int id;
    private int yearsOfExperience;

   public  Applicant(){};

    public Applicant(String name, int id, int yearsOfExperience) {
        this.name = name;
        this.id = id;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;

    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
