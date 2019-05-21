package com.vektorel;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		
		List<String> sinifListesi = new ArrayList<String>(); //List ve ArrayList'e ctrl+bosluk tusuna basip import etmemiz gerekiyor.
		
		sinifListesi.add("Ogrenci-1");
		sinifListesi.add("Ogrenci-2");
		sinifListesi.add("Ogrenci-3");
		sinifListesi.add("Ogrenci-4");
		sinifListesi.add("Ogrenci-5");
		
		for (String item : sinifListesi) {
			System.out.println(item);
		}

	}

}
