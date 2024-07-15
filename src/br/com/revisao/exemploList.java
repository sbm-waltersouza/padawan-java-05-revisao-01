package br.com.revisao;

import java.util.ArrayList;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {
		// Quando Usar: Use quando precisar de uma coleção ordenada que permita duplicatas.
		
		List<String> guestlist = new ArrayList<>();
		guestlist.add("Alice");
		guestlist.add("Bob");
		guestlist.add("Alice"); // Duplicatas permitidas
		
		System.out.println(guestlist);
		System.out.println(guestlist.get(2));

	}

}
