package services;

import entities.Applicant;
import entities.Staff;
import enums.Role;

public interface MangerService {

     String hireApplicant(Applicant applicant, Role role);


     String fireCashier(Staff staff, Role role);


}
