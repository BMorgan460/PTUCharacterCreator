package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Psionic_Analysis extends Feature {
	{
		name = "Psionic Analysis";
		tags = "[Occultism Research Field] [Branch]";
		frequency = "Scene - Extended Action";
		effect = "You are able to analyze Psychic Residue and can determine the following information about the Trainer or Pokemon that left the residue: »» Whether they are a Human or a Pokemon »» Which Psychic-Type Moves they know »» If theyre Human, which of the following Class Features they have: Telepath, Telekinetic, Warper";
		prereqs.put("Witch Hunter", -1);
		prereqs.put("Ocu Edu", 6);
	}
	public Psionic_Analysis(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Witch Hunter") && t.checkSkillRank("Ocu Edu",6);
	}
}