package com.personaws;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

	List<Persona> ps = new ArrayList<Persona>();
	
    @RequestMapping("/personas/todos")
    public List<Persona> todos() {
        
    	if(ps.size() == 0){
    		ps.add(new Persona(1, "Juan Perez", "Panamá", 12, true));
    		ps.add(new Persona(2, "María Luna", "Panamá", 15, false));
    		ps.add(new Persona(3, "Iván Lopez", "Panamá", 18, true));
    	}

        return ps;
    }
    
    @RequestMapping("/personas/buscar")
    public List<Persona> buscarPorNombre(@RequestParam(value = "nombre", defaultValue = "null", required = true)String txt) {
    	List<Persona> filtro = new ArrayList<>();
    	for (Persona p : ps) {
            if (p.getNombre().toLowerCase().contains(txt.toLowerCase())) {
                filtro.add(p);
            }
        }

        return filtro;
    }
    
    @RequestMapping("/personas/nuevo")
    public List<Persona> nuevaPersona(
    		@RequestParam(value = "id", defaultValue = "null", required = true)String id,
    		@RequestParam(value = "nombre", defaultValue = "null", required = true)String nombre,
    		@RequestParam(value = "direccion", defaultValue = "null", required = true)String direccion,
    		@RequestParam(value = "edad", defaultValue = "null", required = true)int edad,
    		@RequestParam(value = "sexo", defaultValue = "null", required = true)boolean sexo
    		) {
    	Persona per = new Persona(ps.size() + 1, nombre, direccion, edad, sexo);
    	ps.add(per);

        return ps;
    }
}