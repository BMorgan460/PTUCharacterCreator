package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Substitute extends Move {
	{
		name = "Substitute";
		effect = "The user loses 1/4 of their maximum Hit Points. This Hit Point loss cannot be prevented in any way. The user creates an Illusory Substitute Coat, which has Hit Points equal to 1/4th of the user�s full Hit Points +1. If the user would be hit by a Move or attack, instead the Substitute gets hit. Apply weakness, resistance and stats to the Substitute. The Substitute is immune to Status Afflictions and Status Moves. Moves with the Social or Sonic keywords completely ignore and bypass the Substitute. Once the Substitute has been destroyed, the user may be hit as normal. Substitute cannot be used if the user has less than 1/4 of their full Hit Points.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Illusion, Coat";
		type = "Normal";
		category = "Status";
	}
	public Substitute(){}
}