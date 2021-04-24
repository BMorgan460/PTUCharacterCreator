package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Haunting_Curse extends Feature {
	{
		name = "Haunting Curse";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is bound, the target gains a Curse Token each time they use a Ghost-Type Move or Ghost Step. Ghost-Type Moves with a Set-Up and Resolution Phase give a Curse Token for each Phase. As a Standard Action during their turn, or as Free Action upon Fainting, the target may spend their Curse Tokens to apply conditions to a foe within 6 meters. »» 1 Curse Token: The target loses a Combat Stage of your choice. »» 2 Curse Tokens: The target becomes Cursed. »» 3 Curse Tokens: The target becomes Suppressed. »» 4 Curse Tokens: The target falls Asleep and gains Bad Sleep.";
		prereqs.put("Ghost Step", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Haunting_Curse(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ghost Step");
	}
}