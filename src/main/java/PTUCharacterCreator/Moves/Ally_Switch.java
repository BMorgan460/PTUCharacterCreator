package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Ally_Switch extends Move {
	{
		name = "Ally Switch";
		effect = "Ally Switch may be declared during a foe’s turn as an Interrupt. The user chooses one willing ally within 6 meters, the target and the user switch places. If the ally was a target of a Move, the user is now the target, If the user was a target of a Move, the ally is now the target.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "6, 1 Target, Interrupt";
		type = "Psychic";
		category = "Status";
	}
	public Ally_Switch(){}
}