package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fell_Stinger extends Move {
	{
		name = "Fell Stinger";
		effect = "If the user successfully knocks out the target with Fell Stinger, raise the user's Attack by +2 CS.";
		damageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Bug";
		category = "Physical";
	}
	public Fell_Stinger(){}
}