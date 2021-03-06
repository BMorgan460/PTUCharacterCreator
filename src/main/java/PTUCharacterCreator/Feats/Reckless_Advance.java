package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Reckless_Advance extends Feature {
	{
		name = "Reckless Advance";
		tags = "[Orders][Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, increase the damage rolls of the targets damaging melee attacks by +8, and these attacks Trip targets on Accuracy Rolls of 18+. When the target of Reckless Advance hits with a damaging melee attack, they become Vulnerable for one full round.";
		prereqs.put("Ravager Orders", -1);
	}
	public Reckless_Advance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ravager Orders");
	}
}