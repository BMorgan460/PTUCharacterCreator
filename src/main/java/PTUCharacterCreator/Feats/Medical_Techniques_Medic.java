package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Medical_Techniques_Medic extends Feature {
	{
		name = "Medical Techniques [Medic]";
		tags = "[9-15 Playtest]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You apply a Restorative Item Effect: The target of the triggering action gains a Tick of Hit Points, plus an additional amount of Hit Points equal to your Medicine Education Rank.";
		prereqs.put("Medic", -1);
		prereqs.put("Med Edu", 4);
	}
	public Medical_Techniques_Medic(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Medic") && t.checkSkillRank("Med Edu",4);
	}
}