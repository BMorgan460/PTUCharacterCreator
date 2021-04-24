package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Psychic_Resonance extends Feature {
	{
		name = "Psychic Resonance";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits a foe with a Psychic-Type Status Move Effect: Your Pokemon may use the Move Encore against the triggering foe, as if it was on their Move List.";
		prereqs.put("Psionic Sponge", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Psychic_Resonance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Psionic Sponge");
	}
}