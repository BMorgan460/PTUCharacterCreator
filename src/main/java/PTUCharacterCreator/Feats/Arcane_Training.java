package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Arcane_Training extends Feature {
	{
		name = "Arcane Training";
		tags = "[+Special Attack][Weapon]";
		frequency = "Static";
		effect = "You may use Arcane Weapons. Attacks made with your Arcane Weapons share the Type of your Elemental Connection. If you have Mystic Senses, these Attacks deal Normal Type Damage. Arcane Weapon users that qualified through Mystic Senses or Elemental Connection (Normal) gain a +5 Bonus to Damage Rolls and a +2 Bonus to Effect Range when using Arcane Weapon Attacks. When wielding an Arcane Weapon, you may resist Disarm Maneuvers with your Occult Education.";
		prereqs.put("Ocu Edu", 3);
		prereqs.put("Elemental Connection or Mystic Senses", 0);
	}
	public Arcane_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3);
	}
}