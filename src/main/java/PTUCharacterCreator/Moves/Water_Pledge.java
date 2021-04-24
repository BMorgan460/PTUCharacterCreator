package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Water_Pledge extends Move {
	{
		name = "Water Pledge";
		effect = "If an ally uses Fire Pledge or Grass Pledge, you may use Water Pledge as Priority (Advanced) immediately after their turn to target the same foe. If used in conjunction with Fire Pledge, a Rainbow is created that lasts for 5 rounds. If used in conjunction with Grass Pledge, the target and all foes adjacent to the target are slowed and have their Speed reduced by 2 Combat Stages. Consult the Pledge keyword for additional details.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target, Pledge";
		type = "Water";
		category = "Special";
	}
	public Water_Pledge(){}
}