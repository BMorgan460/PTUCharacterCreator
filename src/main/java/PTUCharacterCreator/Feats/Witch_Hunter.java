package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Witch_Hunter extends Feature {
	{
		name = "Witch Hunter";
		tags = "[Occultism Research Field] [Branch]";
		frequency = "Static";
		effect = "You gain the Psionic Sight Feature, even if you do not meet the prerequisites. If you already had the Psionic Sight Feature, you instead gain another Feature for which you qualify.";
		prereqs.put("Ocu Edu", 3);
	}
	public Witch_Hunter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3);
	}
}