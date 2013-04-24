/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.web;

import gab.vargas.uabc.oop2.pro17.springmvc.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import gab.vargas.uabc.oop2.pro17.springmvc.domain.Reservation;
import gab.vargas.uabc.oop2.pro17.springmvc.repository.ReservationInitializationDao;
import gab.vargas.uabc.oop2.pro17.springmvc.services.ReservationServiceImp;

/**
 *
 * @author gvargas
 */
@Controller
@RequestMapping("/reservationQuery")
public class RequestQueryController {
    
     private ReservationService reservationService;
     private ReservationInitializationDao  reservationInitializationDao;
    
    @Autowired
    public RequestQueryController(ReservationService reservationService, ReservationInitializationDao reservationInitializationDao) {
        this.reservationService = reservationService;
        this.reservationInitializationDao = reservationInitializationDao;
        this.reservationService.setReservations(this.reservationInitializationDao.getReservationInitialization());
    }

    @RequestMapping(method = RequestMethod.GET)
    public void setupForm(){
    }

    
    
    // Controller will always look for a default POST method irrespective of name
    // when a submission ocurrs on the URL (i.e.@RequestMapping(/reservationQuery)) 
    // In this case, named submitForm to ease identification
    @RequestMapping(method = RequestMethod.POST)
    // Submission will come with courtName field, also add Model to return results 
    public String sumbitForm(@RequestParam("studentId") int studentId, Model model) {
	// Create reservation list
	List<Reservation> reservations = java.util.Collections.emptyList();
	// Make a query if parameter is not null
        if (studentId != 0) {
            reservations = this.reservationService.query(studentId);
        }
	// Update model to include reservations
	model.addAttribute("reservations", reservations);
	// Return view as a string
	// Based on resolver configuration the reservationQuery view 
	// will be mapped to a JSP in /WEB-INF/jsp/reservationQuery.jsp 
        return "reservationQuery";
    }
    
    
}
