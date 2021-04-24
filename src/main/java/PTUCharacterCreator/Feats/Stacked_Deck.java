package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stacked_Deck extends Feature {
	{
		name = "Stacked Deck";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon hits a foe suffering from a Status Affliction or one of the other conditions in the table on page 108 of the Core handbook Effect: Choose a Status Affliction or condition the triggering target is suffering from, the target suffers an additional effect according to the table. Stacked Deck may only affect a foe once per Scene.";
		prereqs.put("Trickster", -1);
		prereqs.put("Guile", 4);
	}
	public Stacked_Deck(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Trickster") && t.checkSkillRank("Guile",4);
	}
}