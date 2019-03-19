package com.zenika.decathlon.tp4.visibilite.package1;

public class ClassB {
	// TODO tester ici les différents champs de la class A ... Mais comment ?
	
	
	
	public void test() {
		ClassA a = new ClassA();
		a.attributPackage.equals(a); 
		a.attributProtected.endsWith(null);
		a.attributPublic.isEmpty();
		
	}

}
