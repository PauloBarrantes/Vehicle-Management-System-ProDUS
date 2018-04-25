package application.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    public String getIndex() {
        return "index";
    }
    @RequestMapping(value="/mantenimiento")
    public String mantenimiento(){

        return "mantenimiento";
    }

    @RequestMapping(value="/reservacion")
    public String reservacion(){
        return "reservacion";
    }
    @RequestMapping(value="/control")
    public String control(){
        return "control";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value="/reservaciones")
    public String reservaciones(){
        return "reservaciones";
    }
}
