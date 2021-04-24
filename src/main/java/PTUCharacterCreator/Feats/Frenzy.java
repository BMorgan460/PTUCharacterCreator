package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Frenzy extends Feature {
	{
		name = "Frenzy";
		tags = "[+HP]";
		frequency = "Scene x2 - Free Action";
		effect = "Condition: You must be Enraged to use this Feature Effect: You may immediately take your turn with Priority. If you do, you are instantly cured of Slowed and Stuck, and for the rest of this turn gain a +2 Bonus to Critical Hit Range, +2 Bonus to Movement Speed, and +2 Bonus to Acrobatics, Athletics, Combat, and Intimidate Checks.";
		prereqs.put("Berserker", -1);
		prereqs.put("Combat", 4);
	}
	public Frenzy(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Berserker") && t.checkSkillRank("Combat",4);
	}
}