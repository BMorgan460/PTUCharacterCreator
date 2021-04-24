package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Conquerors_March extends Feature {
	{
		name = "Conquerors March";
		tags = "[Orders] [+Speed]";
		frequency = "At-Will - Standard Action";
		effect = "Target: Your Pokemon with Run Up Effect: This round, if being used as a Mount, the target may use Dash, Burst, Blast, Cone, or Line range Moves with a range of Pass instead of their usual range.";
		prereqs.put("Ramming Speed", -1);
		prereqs.put("Acrobatics", 4);
		prereqs.put("Athletics", 4);
	}
	public Conquerors_March(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ramming Speed") && t.checkSkillRank("Acrobatics",4) && t.checkSkillRank("Athletics",4);
	}
}