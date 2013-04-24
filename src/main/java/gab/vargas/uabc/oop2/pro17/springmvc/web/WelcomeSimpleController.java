/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.web;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author gvargas
 */
public class WelcomeSimpleController extends AbstractController {

    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
            String type="";
            
            if ("GET".equals(request.getMethod())){
               type = "the method is get: "+ request.getMethod();
            }
            
            if ("POST".equals(request.getMethod())){
               type = "the method is post: "+ request.getMethod();
            }
            
        
        return new ModelAndView("welcomeSimple","type",type);
        
        
    }
    
    
    
}
