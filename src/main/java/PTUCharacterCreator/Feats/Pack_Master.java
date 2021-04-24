package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pack_Master extends Feature {
	{
		name = "Pack Master";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "For you and your Pokemon with Teamwork, Teamworks effect now reads “While you are adjacent to an opponent, allies targeting that opponent receive a +2 bonus to Accuracy Checks”. Whenever you or your Pokemon successfully hit a foe with Pack Hunt, they gain a +2 Bonus to Accuracy Rolls and a +5 Bonus to Damage Rolls against that foe until the end of their next turn.";
		prereqs.put("Pack Tactics", -1);
		prereqs.put("Stealth", 5);
		prereqs.put("Survival", 5);
	}
	public Pack_Master(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Pack Tactics") && t.checkSkillRank("Stealth",5) && t.checkSkillRank("Survival",5);
	}
}