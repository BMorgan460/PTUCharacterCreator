package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Berserker extends Feature {
	{
		name = "Berserker";
		tags = "[Class] [+HP] [Weapon]";
		frequency = "Static";
		effect = "You learn the Moves Rage and Flail. You may use these moves as a Weapon Attack when wielding Melee Weapons.";
		prereqs.put("Combat", 3);
		prereqs.put("Intimidate", 3);
	}
	public Berserker(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && t.checkSkillRank("Intimidate",3);
	}
}