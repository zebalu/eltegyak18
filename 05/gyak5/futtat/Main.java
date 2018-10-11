package futtat;

import osztalyok.Person;
import osztalyok.Id;
import osztalyok.ActiveArray;
import osztalyok.ActivePersonArray;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Person> s = new HashSet<>();
		
		Id id = new Id(123456, "AB");
		Id id2 = new Id(234567, "AB");
		Person p1 = new Person("Gipsz", "Jakab", id);
		Person p2 = new Person("Gipsz", "Jakab", id2);
		Person p3 = new Person("Gipsz", "Jakab", id2);
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		
		System.out.println(s.size());
		
		for(Person p : s) {
			System.out.println(p);
		}
		
		ActiveArray aa = new ActiveArray(0);
		System.out.println("at creatrion: "+aa);
		for(int i=0; i<16; ++i) {
			aa.add(i);
			System.out.println("at i: "+i+"\t"+aa);
		}
		
		ActivePersonArray apa = new ActivePersonArray(0);
		apa.add(p1);
		apa.add(p2);
		apa.add(p3);
		System.out.println(apa);
	}
	

}