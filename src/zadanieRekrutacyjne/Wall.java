package zadanieRekrutacyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Wall implements Structure, CompositeBlock {

	private List<Bl> blocks;
	Bl bl1 = new Bl("czerwony", "plastik");
	Bl bl2 = new Bl("czerwony", "drewno");
	Bl bl3 = new Bl("zielony", "plastik");
	Bl bl4 = new Bl("zielony", "drewno");
	Bl bl5 = new Bl("żółty", "plastik");
	Bl bl6 = new Bl("żółty", "drewno");
	Bl bl7 = new Bl("niebieski", "plastik");
	Bl bl8 = new Bl("niebieski", "drewno");
	Bl bl9 = new Bl("fioletowy", "plastik");
	Bl bl10 = new Bl("fioletowy", "drewno");
	
	@Override
	public String getColor() {
		String color;
		System.out.println("Podaj kolor klocka");
		try (Scanner sc = new Scanner(System.in)) {
			color = sc.next();
		}
		return color;
	}

	@Override
	public String getMaterial() {
		String material;
		System.out.println("Podaj materiał klocka");
		try (Scanner sc = new Scanner(System.in)) {
			material = sc.next();
		}
		return material;
	}

	
	@Override
	public List<Bl> getBlocks() {
		blocks = new ArrayList<Bl>();

		blocks.add(bl1);
		blocks.add(bl2);
		blocks.add(bl3);
		blocks.add(bl4);
		blocks.add(bl5);
		blocks.add(bl6);
		blocks.add(bl7);
		blocks.add(bl8);
		blocks.add(bl9);
		blocks.add(bl10);

		return blocks;
	}

	@Override
	public Optional<Bl> findBlockByColor(String color) {
		// zwraca dowolny element o podanym kolorze

		Optional<Bl> bb = Optional.empty();

		for (Bl b : getBlocks())

			if (b.getColor().equals(color)) {

				bb = Optional.of(b);

			}
		return bb;
	}

	@Override
	public List<Bl> findBlocksByMaterial(String material) {
		// // zwraca wszystkie elementy z danego materiału

		List<Bl> listMat = new ArrayList<Bl>();
		for (Bl b : getBlocks()) {

			if (b.getMaterial().equals(material)) {
				listMat.add(b);
			}
		}

		return listMat;
	}

	@Override
	public int count() {
		// zwraca liczbę wszystkich elementów tworzących strukturę
		int i = 0;
		for (Bl b : getBlocks()) {

			i++;
		}

		return i;
	}

}
