package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rock_Smash extends Move {
	{
		name = "Rock Smash";
		effect = "Rock Smash lowers the target’s Defense 1 Combat Stage on 17+.";
		damageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Rock_Smash(){}
}