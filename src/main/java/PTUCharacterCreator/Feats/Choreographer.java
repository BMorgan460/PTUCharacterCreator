package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Choreographer extends Feature {
	{
		name = "Choreographer";
		tags = "[+Speed]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: The target loses 2 Tutor Point and learns a Dance Move created by yourself. Choreographer may target a Pokemon multiple times.";
		prereqs.put("Dance Form", -1);
		prereqs.put("Acrobatics", 4);
	}
	public Choreographer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dance Form") && t.checkSkillRank("Acrobatics",4);
	}
}