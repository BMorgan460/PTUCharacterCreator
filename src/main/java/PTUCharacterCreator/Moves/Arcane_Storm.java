package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Arcane_Storm extends Move {
	{
		name = "Arcane Storm";
		effect = "All targets of Arcane Storm are Slowed and Vulnerable for 1 Full Round. Limitation: Ranged Weapons only";
		damageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, Blast 3";
		type = "Weapon";
		category = "Special";
	}
	public Arcane_Storm(){}
}