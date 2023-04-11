package entities;

import enums.Role;

public class Staff {
    private int id;
    private String name;
    private String gender;

    private int performanceRating;
    private Role role;


    public Staff(int id, String name, String gender, int performanceRating, Role role) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.performanceRating = performanceRating;
        this.role = role;
    }


    public Staff(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
