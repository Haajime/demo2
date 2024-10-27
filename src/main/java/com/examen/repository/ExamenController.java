package com.examen.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.model.Subject;
import com.repository.ISubjectRepository;

@Controller
public class ExamenController {

	
	@Autowired
	private ISubjectRepository repository;
	
	public String registerSubject() {
		@GetMapping("/registrar")
		
		public String registrerSubject(@RequestParam(name="name", required=false, defaultValue="Subject") String name, Model model) {
		
			Subject Subject1 = new Subject();
			Subject1.setCorreo("Jluis@hotmail.com");
			Subject1.setNombre("OOO1");
			Subject1.getDireccion();
			Subject1.setTelefono("+774115355");
	
			
			return "Registro_Pacientes";
	}
}
