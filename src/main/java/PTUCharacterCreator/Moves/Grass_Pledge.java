package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Grass_Pledge extends Move {
	{
		name = "Grass Pledge";
		effect = "If an ally uses Fire Pledge or Water Pledge, you may use Grass Pledge as Priority (Advanced) immediately after their turn to target the same foe. If used in conjunction with Fire Pledge, Fire Hazards are created in a Burst 1 around the target. If used in conjunction with Water Pledge, the target and all foes adjacent to the the target are slowed and have their Speed reduced by 2 Combat Stages. Consult the Pledge keyword for additional details.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "Scene";
		range = "6, 1 Target, Pledge";
		type = "Grass";
		category = "Special";
	}
	public Grass_Pledge(){}
}