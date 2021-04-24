package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Man_of_Steel extends Feature {
	{
		name = "Man of Steel";
		tags = "[+Defense] [Weapon]";
		frequency = "Static";
		effect = "You learn the Moves Meteor Mash and Kings Shield. You may use these Moves as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Steelheart", -1);
		prereqs.put("Athletics", 6);
		prereqs.put("Focus", 6);
	}
	public Man_of_Steel(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart") && t.checkSkillRank("Athletics",6) && t.checkSkillRank("Focus",6);
	}
}