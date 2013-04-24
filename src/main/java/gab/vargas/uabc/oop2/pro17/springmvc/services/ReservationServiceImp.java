/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.services;

import gab.vargas.uabc.oop2.pro17.springmvc.domain.Reservation;
import gab.vargas.uabc.oop2.pro17.springmvc.repository.ReservationInitializationDaoMemory;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author gvargas
 */
public class ReservationServiceImp implements ReservationService{

    
    private List<Reservation> reservations;

    
    public ReservationServiceImp() {
    
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    @Override
    public List<Reservation> query(int studentId) {
        
        List<Reservation> result = new ArrayList<Reservation>();
        for (Reservation reservation : reservations) {
            if (reservation.getStudent().getStudentId()== studentId) {
                result.add(reservation);
            }
        }
        return result;
        
    }


    
}
