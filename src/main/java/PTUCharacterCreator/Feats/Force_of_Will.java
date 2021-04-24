package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Force_of_Will extends Feature {
	{
		name = "Force of Will";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon uses a Psychic-Type Status Move with a range of Blessing, Field, Hazard, or Self. Effect: Your Pokemon may immediately use another Psychic-Type Status Move from its Move List with a range of Blessing, Field, Hazard, or Self.";
		prereqs.put("Psionic Sponge", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Force_of_Will(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Psionic Sponge");
	}
}