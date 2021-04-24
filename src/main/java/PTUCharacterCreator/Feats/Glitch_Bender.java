package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glitch_Bender extends Feature {
	{
		name = "Glitch Bender";
		tags = "[Class] [+Special Defense]";
		frequency = "Static";
		effect = "You gain the Synchronize Ability.";
		prereqs.put("Glitched Existence", -3);
		prereqs.put("Focus", 3);
	}
	public Glitch_Bender(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Glitched Existence") && t.checkSkillRank("Focus",3);
	}
}