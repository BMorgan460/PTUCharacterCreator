package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Smelling_Salts extends Move {
	{
		name = "Smelling Salts";
		effect = "If the target is Paralyzed, Smelling Salt’s Damage Base is doubled to 14 (4d10+15 / 40), and cures the target of Paralysis.";
		damageBase = 7;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Smelling_Salts(){}
}