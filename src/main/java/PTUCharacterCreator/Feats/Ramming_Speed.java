package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ramming_Speed extends Feature {
	{
		name = "Ramming Speed";
		tags = "[+Speed]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: The target loses 2 Tutor Points and gains the Run Up Ability.";
		prereqs.put("Rider", -1);
	}
	public Ramming_Speed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Rider");
	}
}