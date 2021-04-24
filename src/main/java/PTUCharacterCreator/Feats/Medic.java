package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Medic extends Feature {
	{
		name = "Medic";
		tags = "[Class] [9-15 Playtest]";
		frequency = "Static";
		effect = "You are always considered to have access to a First Aid Manual and a Combat Medics Primer, and are  always considered to be Binding their Rank 1 Effects without actually using any AP.";
		prereqs.put("Med Edu", 3);
	}
	public Medic(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",3);
	}
}