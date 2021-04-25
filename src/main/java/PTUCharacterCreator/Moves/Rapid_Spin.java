package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rapid_Spin extends Move {
	{
		name = "Rapid Spin";
		effect = "Rapid Spin destroys all Hazards within 5 meters, removes Leech Seeds, and removes the user's Trapped or Stuck status.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Spirit Surge";
		type = "Normal";
		category = "Physical";
	}
	public Rapid_Spin(){}
}