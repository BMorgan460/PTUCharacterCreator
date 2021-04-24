package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Metamagic extends Feature {
	{
		name = "Metamagic";
		tags = "[+Special Attack]";
		frequency = "1 AP - Swift Action ";
		effect = "Trigger: You use a Special Move Effect: You may apply a Rank 1 Power Manipulation to your attack. Rank 1 Power Manipulations are: Energy Finesse, Warp Energy, Directed Barrier, Power Overdrive";
		prereqs.put("Arcanist", -1);
		prereqs.put("Ocu Edu", 4);
	}
	public Metamagic(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Arcanist") && t.checkSkillRank("Ocu Edu",4);
	}
}