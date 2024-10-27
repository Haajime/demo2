package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RegistroDatos")
public class Datos_Medicos {
@Id
	private String historialOdon;
	private String alergias;
	private String tratamiento;
	
	
	
	@Override
	public String toString() {
		return "RegistroDatos[historialOdon="+",alergias"+",tratamiento"+ "]";
	
	}
	public String getHistorialOdon() {
		return historialOdon;
	}

	public void setHistorialOdon(String historialOdon) {
		this.historialOdon = historialOdon;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
	
	
	
	
	

}
