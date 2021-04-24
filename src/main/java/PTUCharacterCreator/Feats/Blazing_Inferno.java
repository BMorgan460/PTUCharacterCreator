package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Blazing_Inferno extends Feature {
	{
		name = "Blazing Inferno";
		tags = "[+Special Attack or Attack]";
		frequency = "2 AP - Swift Action ";
		effect = "Effect: You becoming Blazing. While you are Blazing, whenever your Fire-Type Moves Inflict Burn, the Burned target immediately loses a Tick of Hit Points, and loses an additional Combat Stage in Defense. While Blazing, when you hit a foe with a damaging Fire-Type Move, you may choose to automatically burn one target of the Move. If you do, you lose the Blazing Condition after the Moves effects are resolved.";
		prereqs.put("Fire Breather Rank 2", -1);
		prereqs.put("Combat", 6);
		prereqs.put("Focus", 6);
	}
	public Blazing_Inferno(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fire Breather Rank 2") && t.checkSkillRank("Combat",6) && t.checkSkillRank("Focus",6);
	}
}