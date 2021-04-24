package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Steelheart extends Feature {
	{
		name = "Steelheart";
		tags = "[Class] [+Defense] [Weapon]";
		frequency = "Static";
		effect = "When wielding metal Melee Weapons, you may use Athletics or Focus instead of Combat to determine the Damage Base of your Struggle Attacks, to qualify for a Weapons Moves, and to resist Disarm Checks. Whenever your Weapon Attacks hit a foe who has previously hit you with a Melee attack in the same round, the foe loses a Tick of Hit Points.";
		prereqs.put("Elemental Connection (Steel)", 0);
		prereqs.put("Athletics", 3);
		prereqs.put("Focus", 3);
	}
	public Steelheart(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.checkSkillRank("Focus",3);
	}
}