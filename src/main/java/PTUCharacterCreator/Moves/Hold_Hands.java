package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Hold_Hands extends Move {
	{
		name = "Hold Hands";
		effect = "Both the user and the target become Cheered. They may give up the Cheered condition when making a Save Check to roll twice and take the best result.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Hold_Hands(){}
}