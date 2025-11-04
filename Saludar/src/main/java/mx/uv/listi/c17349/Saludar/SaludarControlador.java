package mx.uv.listi.c17349.Saludar;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class SaludarControlador {
    Saludador persona;
    
    @RequestMapping("/")
    public String home() {
        return "Hola";
    }

    @GetMapping(value = {"/saludar", "/saludar/{nombre}"})
    public String Saludar(@PathVariable(required = false) String nombre) {
        return nombre == null ? "Hola, visitante!" : "Hola, " + nombre + "!";
    }


    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar(){
        Saludador s = new Saludador("xxx");
        return s;
    }

    @GetMapping("/saludarget")
    public void saludarGet(){

    }

    @PostMapping("/saludarpost")
    public void saludarPost(){
        
    }

    @GetMapping("query")
    public void metodo(@RequestParam String nombre){
        System.out.println(nombre);
    }

    @RequestMapping("/backend")
    public String backend(@RequestParam String nombre, @RequestParam String password){
        //System.out.println("resultado" + nombre + "--" + password);
        return "Exito" + nombre + "--" + password;
    }
}
