package controlador;

import modelo.Persona;
import modelo.dao.PersonaDao;
import modelo.vo.PersonaVo;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class PersonaController {

	private Persona persona;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaBuscar miVentanaBuscar;
	
	public PersonaController() {
		persona = new Persona();
	}
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public VentanaRegistro getMiVentanaRegistro() {
		return miVentanaRegistro;
	}
	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;
	}
	public VentanaBuscar getMiVentanaBuscar() {
		return miVentanaBuscar;
	}
	public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
		this.miVentanaBuscar = miVentanaBuscar;
	}
	public Persona getMiLogica() {
		return persona;
	}
	
//////////////////////////////////////////////////////////
	
	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}
	public void mostrarVentanaConsulta() {
		miVentanaBuscar.setVisible(true);
	}
	
	public void registrarPersona(PersonaVo miPersona) {
		persona.registrarPersona(miPersona);
	}
	
	public PersonaVo buscarPersona(String codigoPersona) {
		return persona.getPersona(codigoPersona);
	}
	
	public void modificarPersona(PersonaVo miPersona) {
		persona.updatePersona(miPersona);
	}
	public void eliminarPersona(String codigo) {
		persona.deletePersona(codigo);
	}
}
