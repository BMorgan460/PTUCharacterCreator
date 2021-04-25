package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dragon_Breath extends Move {
	{
		name = "Dragon Breath";
		effect = "Dragon Breath Paralyzes the target on 15+.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Dragon";
		category = "Special";
	}
	public Dragon_Breath(){}
}