package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Insectoid_Utility extends Feature {
	{
		name = "Insectoid Utility";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemon with the following Capabilities have the upgrades below applied to them. »» Threaded: Your Pokemon may use its Threaded attack to perform Combat Maneuvers, including Grapple and Push. »» Wallclimber: Your Pokemon becomes Immune to Push and Trip effects. »» Naturewalk: Your Pokemon cannot be Slowed or Stuck in its appropriate Terrains. »» Sky: Your Pokemon has a +1 bonus to its Speed Evasion.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Bug as Chosen Type", 0);
	}
	public Insectoid_Utility(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}