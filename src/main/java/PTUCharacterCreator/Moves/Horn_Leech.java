package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Horn_Leech extends Move {
	{
		name = "Horn Leech";
		effect = "After the target takes damage, the user gains HP equal to half of the damage they dealt to the target.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash";
		type = "Grass";
		category = "Physical";
	}
	public Horn_Leech(){}
}