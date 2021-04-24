package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Scoundrels_Strike extends Feature {
	{
		name = "Scoundrel's Strike";
		tags = "[+Attack]";
		frequency = "Daily x3 - Swift Action";
		effect = "Trigger: You hit with a Rogue Move Effect: The target loses Hit Points equal to your highest Rogue Skill Rank doubled, and an additional effect based on whether you have the Ambush or Cruelty Ability. You may use Scoundrels Strike only once per Scene per target. »» Ambush: For 1 Full Round, the target is Slowed, cannot make Attacks of Opportunity, and takes a -2 penalty to all rolls. »» Cruelty: For 1 Full Round, the target loses 5 Hit Points upon being hit by any damaging attack.";
		prereqs.put("Underhanded Tactics", -1);
		prereqs.put("Street Fighter", -1);
	}
	public Scoundrels_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Underhanded Tactics") && t.hasFeat("Street Fighter");
	}
}