package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spikes extends Move {
	{
		name = "Spikes";
		effect = "Set 8 square meters of Spikes within the range such that all 8 meters are adjacent with at least one other space of Spikes. Spikes cause terrain to count as Slow Terrain, and a grounded foe that runs into the hazards will lose 1/10th of their full HP and become Slowed until the end of their next turn.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "6, Hazard";
		type = "Ground";
		category = "Status";
	}
	public Spikes(){}
}