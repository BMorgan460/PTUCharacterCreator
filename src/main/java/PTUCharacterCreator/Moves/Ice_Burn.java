package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Ice_Burn extends Move {
	{
		name = "Ice Burn";
		effect = "Set-Up Effect: The user may shift, then ends their turn. Resolution Effect: The user attacks with Ice Burn. Ice Burn Burns on 15+.";
		damageBase = 14;
		AC = 4;
		frequency = "Scene";
		range = "10, 1 Target, Set-Up, Full Action";
		type = "Ice";
		category = "Special";
	}
	public Ice_Burn(){}
}