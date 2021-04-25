package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fury_Cutter extends Move {
	{
		name = "Fury Cutter";
		effect = "If Fury Cutter is used successfully and consecutively on the same target, the Damage Base is increased by +4, the first hit has a DB of 4, the second hit a DB of 8, the third hit a DB of 12, and the fourth and all further hits have a DB of 16. If Fury Cutter misses or fails to damage its target, its Damage Base resets.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Bug";
		category = "Physical";
	}
	public Fury_Cutter(){}
}