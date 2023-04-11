package services.serviceImplementation;

import entities.Applicant;
import entities.Staff;
import entities.Store;
import enums.Role;
import services.MangerService;

public class ManagerServiceImplementation implements MangerService {
   Applicant applicant = new Applicant();
   Store store  = new Store();


   @Override
   public  String hireApplicant(Applicant applicant, Role role) {
      store.setYearOfExperience(3);
      if (role.equals(Role.MANAGER ) && applicant.getYearsOfExperience() >= store.getYearOfExperience()) {
           return "You are employed";
         }
      return "You are not qualified";

   }

   @Override
   public String fireCashier(Staff staff, Role role) {
      store.setPerformanceRating(9);
      if (role.equals(Role.MANAGER) && staff.getPerformanceRating() >= store.getPerformanceRating() ) {
            return "You have done a good job, please keep it up";
         }
         return "We are sorry to inform u, your service is no more needed ";
      }


}
