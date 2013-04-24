/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.repository;

import gab.vargas.uabc.oop2.pro17.springmvc.domain.EquipmentType;
import gab.vargas.uabc.oop2.pro17.springmvc.domain.Reservation;
import gab.vargas.uabc.oop2.pro17.springmvc.domain.Student;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author gvargas
 */
public class ReservationInitializationDaoMemory implements ReservationInitializationDao{

  
    public ReservationInitializationDaoMemory() {
    }
    
    
    public List<Reservation> getReservationInitialization(){
        
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setFirstName("Juan");
        student1.setLastName("Perez");
        student1.setPhoneHome("510-555-5858");
        student1.setPhoneHome("510-551-5151");
        
        
        Student student2 = new Student();
        student2.setStudentId(52);
        student2.setFirstName("Pedro");
        student2.setLastName("Lopez");
        student2.setPhoneHome("510-665-5858");
        student2.setPhoneHome("510-858-5151");
        
        
        EquipmentType equipmentType1 = new EquipmentType();
        equipmentType1.setEquipmentLab("complap1");
        equipmentType1.setEquipmentTypeId(10);
        equipmentType1.setEquipmentName("computer");
        
        
        EquipmentType equipmentType2 = new EquipmentType();
        equipmentType2.setEquipmentLab("complap2");
        equipmentType2.setEquipmentTypeId(15);
        equipmentType2.setEquipmentName("laptop");
        
        
        EquipmentType equipmentType3 = new EquipmentType();
        equipmentType3.setEquipmentLab("complap2");
        equipmentType3.setEquipmentTypeId(20);
        equipmentType3.setEquipmentName("computer");
        
        
        EquipmentType equipmentType4 = new EquipmentType();
        equipmentType4.setEquipmentLab("complap1");
        equipmentType4.setEquipmentTypeId(25);
        equipmentType4.setEquipmentName("laptop");
        
        
        List<Reservation> reservations = new ArrayList<Reservation>();
        
        Reservation reservation1 = new Reservation();
        reservation1.setReservationId(1);
        reservation1.setHour(2);
        reservation1.setDate(new GregorianCalendar(2012,10, 14).getTime());
        reservation1.setStudent(student1);
        reservation1.setEquipmentType(equipmentType1);
        
        Reservation reservation2 = new Reservation();
        reservation2.setReservationId(2);
        reservation2.setHour(2);
        reservation2.setDate(new GregorianCalendar(2008,10, 14).getTime());
        reservation2.setStudent(student1);
        reservation2.setEquipmentType(equipmentType2);
        
        
        Reservation reservation3 = new Reservation();
        reservation3.setReservationId(3);
        reservation3.setHour(3);
        reservation3.setDate(new GregorianCalendar(2008,10, 14).getTime());
        reservation3.setStudent(student2);
        reservation3.setEquipmentType(equipmentType3);
        
        
        
        Reservation reservation4 = new Reservation();
        reservation4.setReservationId(4);
        reservation4.setHour(3);
        reservation4.setDate(new GregorianCalendar(2008,10, 14).getTime());
        reservation4.setStudent(student2);
        reservation4.setEquipmentType(equipmentType4);
        
        reservations.add(reservation1);
        reservations.add(reservation2);
        reservations.add(reservation3);
        reservations.add(reservation4);
        
        return reservations;
        
        
        
        
    }
    
    
}
