package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Phantom_Menace extends Feature {
	{
		name = "Phantom Menace";
		tags = "[+Attack] [Weapon]";
		frequency = "Static";
		effect = "You gain the Moves Shadow Claw and Phantom Force. You may use these Moves as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Shadow Arms", -1);
		prereqs.put("Ocu Edu", 5);
		prereqs.put("Intimidate", 5);
	}
	public Phantom_Menace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shadow Arms") && t.checkSkillRank("Ocu Edu",5) && t.checkSkillRank("Intimidate",5);
	}
}