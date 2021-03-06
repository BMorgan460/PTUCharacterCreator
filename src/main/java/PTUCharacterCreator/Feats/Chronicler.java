package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Chronicler extends Feature {
	{
		name = "Chronicler";
		tags = "[Class]";
		frequency = "1 AP - Swift Action, Interrupt";
		effect = "Target: A Pokemon, Trainer, Move, or Location. Effect: You make Record of the target. Records can be placed in an Archive as an Extended Action. When you take Chronicler, you gain one Archive.  See Extras - Class Mechanics for Archive details.";
		prereqs.put("Perception", 3);
	}
	public Chronicler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception",3);
	}
}