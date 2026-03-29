package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="employees")
public class EmployeeEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateOfJoining;
    private boolean isactive;
}
