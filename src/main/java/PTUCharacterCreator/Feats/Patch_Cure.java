package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Patch_Cure extends Feature {
	{
		name = "Patch Cure";
		tags = "[Apothecary Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: A Restorative Item Effect: You distill the target, gaining 3 Restorative Patches. Restorative Patches have the same effect as the items from which they were created, but can only be applied as an Extended Action. Recipe - Super Cures";
		prereqs.put("Apothecary", -1);
		prereqs.put("Med Edu", 4);
	}
	public Patch_Cure(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apothecary") && t.checkSkillRank("Med Edu",4);
	}
}