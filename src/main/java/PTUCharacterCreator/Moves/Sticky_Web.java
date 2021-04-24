package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sticky_Web extends Move {
	{
		name = "Sticky Web";
		effect = "Set 8 square meters of Sticky Web hazards within your range such that all 8 meters are adjacent with at least one other space of Sticky Web. Sticky Web causes Terrain to become Slow Terrain, and a grounded foe that runs into the hazard has its Speed lowered by -1 CS and becomes Slowed until the end of their next turn. Flying-type Pokemon and Pokemon and Trainers with Levitate are not affected by Sticky Web. Bug-type Pokemon may move over Sticky Web harmlessly, destroying theHazards as they do so. *Grants Threaded";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "6, Hazard";
		type = "Bug";
		category = "Status";
	}
	public Sticky_Web(){}
}