package com.zenika.decathlon.tp4.visibilite.package2;

import com.zenika.decathlon.tp4.visibilite.package1.ClassA;

public class ClassC extends ClassA {

	// TODO tester ici les différents champs de la superclasse ... Mais comment ?
	public void test() {
		ClassA a = new ClassA();
		a.attributPublic.toUpperCase();
		super.attributPublic.hashCode();
	
	}
}
