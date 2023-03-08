package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List<String> lista;
	
	public Parole() {
		//lista = new LinkedList<String>();
		lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		lista.clear();
	}
	
	public boolean removeParola(String string) {
		return lista.remove(string);
	}

}