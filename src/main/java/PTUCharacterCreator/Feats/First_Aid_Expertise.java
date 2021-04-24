package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class First_Aid_Expertise extends Feature {
	{
		name = "First Aid Expertise";
		tags = "";
		frequency = "Daily x3 - Extended Action";
		effect = "Target: Pokemon or Trainers Effect: The target may remove one Injury, has all Hit Points restored, and is cured of all Status Afflictions. You may use First Aid Expertise only once per day per target. First Aid Expertise requires access to a First Aid Kit.";
		prereqs.put("Medic Training", -3);
		prereqs.put("Med Edu", 5);
	}
	public First_Aid_Expertise(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Medic Training") && t.checkSkillRank("Med Edu",5);
	}
}