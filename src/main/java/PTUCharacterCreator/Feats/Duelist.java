package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Duelist extends Feature {
	{
		name = "Duelist";
		tags = "[Class]";
		frequency = "At-Will - Swift Action";
		effect = "Target: A Pokemon or Trainer Effect: The Foe becomes Tagged, or if the foe is already Tagged, the foe loses the Tag. Only one foe can be Tagged this way at a time. If a new Foe is Tagged, all other Tags are lost. Your Pokemon under the effects of Focused Training gain half their Momentum (rounded up) as a Bonus to Accuracy and Evasion against Tagged Foes, but as long as a Foe is Tagged, they do not benefit from Focused Trainings Accuracy Bonus against other foes.  See Extras - Class Mechanics for Momentum details.";
		prereqs.put("Focused Training", -1);
		prereqs.put("Focus", 3);
	}
	public Duelist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Focused Training") && t.checkSkillRank("Focus",3);
	}
}