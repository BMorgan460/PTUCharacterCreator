package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Innovation extends Feature {
	{
		name = "Innovation";
		tags = "";
		frequency = "Daily - Extended Action";
		effect = "Target: A Pokemon with at least 1 Tutor Point. Effect: The target loses 1 Tutor Point, and then learns a Move created with Innovation. See the next section on page 84 for details on creating Moves for this Feature. A Pokemon may only have one Move created by Innovation at a time.";
		prereqs.put("Adaptable Performance", -1);
	}
	public Innovation(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Adaptable Performance");
	}
}