/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.services;

import gab.vargas.uabc.oop2.pro17.springmvc.domain.Reservation;
import java.util.List;

/**
 *
 * @author gvargas
 */
public interface ReservationService {
    
    public List<Reservation> query(int studentId);
    public void setReservations(List<Reservation> reservations);
    
}
