package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Retaliate extends Move {
	{
		name = "Retaliate";
		effect = "Retaliate's DB is doubled to DB 14 (4d10+15 / 40) if an ally has been Fainted by a Damaging Move used by the Target in the last 2 rounds of Combat.";
		damageBase = 7;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Retaliate(){}
}