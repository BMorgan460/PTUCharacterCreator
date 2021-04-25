package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thunder_Wave extends Move {
	{
		name = "Thunder Wave";
		effect = "Thunder Wave cannot miss. Thunder Wave Paralyzes the target. Pokemon immune to Electric Attacks are immune to Thunder Wave's effects.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Electric";
		category = "Status";
	}
	public Thunder_Wave(){}
}