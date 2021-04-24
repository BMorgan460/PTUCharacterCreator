package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aura_Mastery extends Feature {
	{
		name = "Aura Mastery";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "Choose two of Aura Sphere, Focus Blast, Drain Punch, or Focus Punch. You learn the chosen Moves.";
		prereqs.put("Aura Guardian", -1);
		prereqs.put("Intuition", 5);
	}
	public Aura_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aura Guardian") && t.checkSkillRank("Intuition",5);
	}
}