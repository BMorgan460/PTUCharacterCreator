package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fire_Pledge extends Move {
	{
		name = "Fire Pledge";
		effect = "If an ally uses Grass Pledge or Water Pledge, you may use Fire Pledge as Priority (Advanced) immediately after their turn to target the same foe. If used in conjunction with Grass Pledge, Fire Hazards are created in a Brust 1 around the target. If used in conjucntion with Water Pledge, a Rainbow is created that lasts for 5 rouns. Counsult the Pledge keyword for additional details.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "Scene";
		range = "6, 1 Target, Pledge";
		type = "Fire";
		category = "Special";
	}
	public Fire_Pledge(){}
}