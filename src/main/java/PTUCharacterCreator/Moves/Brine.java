package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Brine extends Move {
	{
		name = "Brine";
		effect = "If the target’s Hit Points are under 50%, Brine’s Damage Base is increased to Damage Base 13 (4d10+10 / 35).";
		damageBase = 7;
		AC = 2;
		frequency = "Scene x2";
		range = "6,  1 Target";
		type = "Water";
		category = "Special";
	}
	public Brine(){}
}