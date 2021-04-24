package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dance_Practice extends Feature {
	{
		name = "Dance Practice";
		tags = "[+Speed]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: The target loses 2 Tutor Points and gains your choice of Spinning Dance or Own Tempo. Dance Practice may target a Pokemon only once.";
		prereqs.put("Dancer", -1);
	}
	public Dance_Practice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dancer");
	}
}