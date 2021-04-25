package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Night_Shade extends Move {
	{
		name = "Night Shade";
		effect = "The target loses HP equal to the level of Night Shade's user. Do not apply weakness or resistance. Do not apply stats.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "8, 1 Target";
		type = "Ghost";
		category = "Special";
	}
	public Night_Shade(){}
}