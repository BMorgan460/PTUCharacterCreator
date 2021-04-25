package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Freeze_Shock extends Move {
	{
		name = "Freeze Shock";
		effect = "Set-Up Effect: The user may shift, then ends their turn. Resolution Effect: The user attacks with Freeze Shock. Freeze Shock paralyzes on 15+.";
		damageBase = 14;
		mDamageBase = 14;
		AC = 4;
		frequency = "Scene";
		range = "10, 1 Target, Set-Up, Full Action";
		type = "Ice";
		category = "Physical";
	}
	public Freeze_Shock(){}
}