package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Toxic_Spikes extends Move {
	{
		name = "Toxic Spikes";
		effect = "Set 8 square meters of Toxic Spikes within the range such that all 8 meters are adjacent with at least one other space of Toxic Spikes. Toxic Spikes cause Terrain to become Slow Terrain, and a grounded foe that runs into the hazard becomes Poisoned and Slowed until the end of their next turn. If there are 2 layers of Toxic Spikes on the same space, it Badly Poisons the foes instead. Poison-Type Pokemon may move over Toxic Spikes harmlessly, destroying the Hazards as they do so.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "6, Hazard";
		type = "Poison";
		category = "Status";
	}
	public Toxic_Spikes(){}
}