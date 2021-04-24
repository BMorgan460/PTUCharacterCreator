package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Authentic_Thaumaturgy extends Feature {
	{
		name = "Authentic Thaumaturgy";
		tags = "[+Special Attack]";
		frequency = "Scene x2 - Swift Action ";
		effect = "Trigger: You use a Special Move  Effect: You may apply a Rank 2 Power Manipulation to your attack. Rank 2 Power Manipulations are: Berserk Blow, Energy Link, Enlarged Power, Lock of Fate";
		prereqs.put("Arcanist", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Authentic_Thaumaturgy(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Arcanist") && t.checkSkillRank("Ocu Edu",5);
	}
}