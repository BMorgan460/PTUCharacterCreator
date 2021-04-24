package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Miasmic_Spray extends Feature {
	{
		name = "Miasmic Spray";
		tags = "[+Defense]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You hit with Acid, Clear Smog, Sludge Bomb, Sludge Wave, or Toxic, or use Acid Armor:   The Effect of this feature depends on the triggering move. Acid:  Instead of its usual effect, Acid lowers the Special Defense of all targets hit by -2 Combat Stages. Clear Smog:  Clear Smogs target loses 5 HP for each combat stage lost. Sludge Bomb:  The Target receives a -3 penalty to Accuracy Rolls until the end of your next turn. Sludge Wave:  All targets in Sludge Wave's Burst are Slowed until the end of their next turn. Toxic:  The target's Badly Poison Hit Point Loss begins at 10 instead of 5. Acid Armor:  You are not slowed while liquefied and resist all special damage one step.";
		prereqs.put("Miasmas Call", -1);
		prereqs.put("Guile", 6);
		prereqs.put("Stealth", 6);
	}
	public Miasmic_Spray(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Miasmas Call") && t.checkSkillRank("Guile",6) && t.checkSkillRank("Stealth",6);
	}
}