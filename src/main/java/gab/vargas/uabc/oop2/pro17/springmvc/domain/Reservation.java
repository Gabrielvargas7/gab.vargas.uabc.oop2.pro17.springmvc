/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.domain;

import java.util.Date;

/**
 *
 * @author gvargas
 */
public class Reservation {
    
    private int reservationId;
    private Date date;
    private int hour;    // time must be in 1 to 24 hours
    private Student student;
    private EquipmentType equipmentType; 

    public Reservation() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    

    
    
}
