package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Steel_Wind extends Feature {
	{
		name = "Steel Wind";
		tags = "[+Defense] [Weapon]";
		frequency = "Static";
		effect = "Static Effect: You learn the Moves Bullet Punch and Metal Claw. You may use these Moves as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Steelheart", -1);
	}
	public Steel_Wind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart");
	}
}