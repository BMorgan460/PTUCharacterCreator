package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mold_the_Earth extends Feature {
	{
		name = "Mold the Earth";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon with the Groundshaper Capability uses a Ground-Type Move Effect: Your Pokemon may use the Groundshaper Capability as a Free Action. When used this way, Groundshaper creates Spike Hazards in each square turned into Rough or Slow Terrain. If you wish, instead of Groundshapers normal range, you may choose to affect the square targeted by the attack and all cardinally adjacent squares. If the triggering Move is a Burst, Blast, Line, or Cone, you may choose to affect all squares in the targeted area instead.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Ground as Chosen Type", 0);
	}
	public Mold_the_Earth(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}