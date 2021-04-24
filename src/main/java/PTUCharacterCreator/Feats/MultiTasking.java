package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class MultiTasking extends Feature {
	{
		name = "Multi-Tasking";
		tags = "[+Speed]";
		frequency = "Scene x2 - Swift Action";
		effect = "You may take two Standard Actions instead of one this turn, but both actions must have an At-Will Frequency.";
		prereqs.put("20 Speed Stat", 0);
		prereqs.put("Acrobatics", 6);
	}
	public MultiTasking(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6) && t.getSpeed() >= 20;
	}
}