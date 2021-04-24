package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cutthroat extends Feature {
	{
		name = "Cutthroat";
		tags = "[+Attack] [Weapon]";
		frequency = "Static";
		effect = "You may use Rogue Moves as Weapon Moves when wielding Small Melee Weapons or Short Ranged Weapons. If you do, Rogue Moves instead have the same Range as your Weapon. Additionally, you may qualify for Weapon Moves for Small Melee or Short Ranged Weapons and resist Disarm Maneuvers when wielding such Weapons using any Rogue Skill.";
		prereqs.put("Rogue", -1);
	}
	public Cutthroat(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Rogue");
	}
}