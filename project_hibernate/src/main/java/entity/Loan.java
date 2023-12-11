package entity;

import base.domin.BaseEntity;
import entity.enumuration.LoanType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Loan extends BaseEntity<Integer> {


    Integer countOfLoan;

    @ManyToOne
    @JoinColumn(name = "students_id")
    Student student;

    @OneToMany
    List<Installment>installments;



}