package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Unconquerable extends Feature {
	{
		name = "Unconquerable";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon uses a Dragon-Type Move while they have 3 or more Status Afflictions Effect: Your Pokemon is cured of up to three Status Afflictions.";
		prereqs.put("Tyrant's Roar", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Unconquerable(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tyrant's Roar");
	}
}