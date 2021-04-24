package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Burst_of_Speed extends Feature {
	{
		name = "Burst of Speed";
		tags = "[+Speed]";
		frequency = "Scene - Free Action";
		effect = "Trigger: You end your turn Effect: Select an Initiative Count equal to half of your own Initiative or less, you may take an extra turn at that point in the round.";
		prereqs.put("5 Tumbler Features", 0);
		prereqs.put("Acrobatics", 6);
	}
	public Burst_of_Speed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6);
	}
}