package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Charge_Beam extends Move {
	{
		name = "Charge Beam";
		effect = "If Charge Beam successfully hits a target, roll 1d20. On a roll of 7+, the user's Special Attack is raised by +1 Combat Stage.";
		damageBase = 5;
		AC = 4;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Charge_Beam(){}
}