package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Crash_and_Smash extends Feature {
	{
		name = "Crash and Smash";
		tags = "[+HP] [Weapon]";
		frequency = "Static";
		effect = "You learn the Moves Double Edge and Thrash. You may use these moves as a Weapon Attack when wielding Melee Weapons.";
		prereqs.put("Frenzy", -1);
		prereqs.put("Combat", 5);
	}
	public Crash_and_Smash(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Frenzy") && t.checkSkillRank("Combat",5);
	}
}