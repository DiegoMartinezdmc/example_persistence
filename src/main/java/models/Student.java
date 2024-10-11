package models;

import jakarta.persistence.Column;
import org.hibernate.validator.constraints.Length;

public class Student extends BaseEntity {
   @Column(unique = true)
    private String cif;
   @Column(nullable = false)
   @Length(min = 3, max = 60)
    private String firstName;
    private String lastName;
    private String email;


}
