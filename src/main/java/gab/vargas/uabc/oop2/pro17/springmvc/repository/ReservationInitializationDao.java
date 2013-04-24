/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.repository;

import gab.vargas.uabc.oop2.pro17.springmvc.domain.Reservation;
import java.util.List;

/**
 *
 * @author GabrielVargas
 */
public interface ReservationInitializationDao {

     public List<Reservation> getReservationInitialization();
}
