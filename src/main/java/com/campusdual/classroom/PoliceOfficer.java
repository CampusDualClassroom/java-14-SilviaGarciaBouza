package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}
	@Override
	public void getDetails() {
		System.out.println("Oficial de policia: nombre: "+super.name+", apellido: "+super.surname+", escuadron: "+this.squad);
	}
}
