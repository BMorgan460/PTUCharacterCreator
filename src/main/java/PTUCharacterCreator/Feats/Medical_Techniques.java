package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Medical_Techniques extends Feature {
	{
		name = "Medical Techniques";
		tags = "[Apothecary Research Field] [Branch]";
		frequency = "1 AP - Swift Action";
		effect = "Trigger: You apply a Restorative Item Effect: The target gains a Tick of Hit Points, plus an additional amount of Hit Points equal to your Medicine Education Rank. Recipe - Hyper Cures";
		prereqs.put("Apothecary", -1);
		prereqs.put("Med Edu", 5);
	}
	public Medical_Techniques(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apothecary") && t.checkSkillRank("Med Edu",5);
	}
}