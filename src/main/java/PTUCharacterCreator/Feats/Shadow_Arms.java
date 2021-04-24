package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shadow_Arms extends Feature {
	{
		name = "Shadow Arms";
		tags = "[+Attack] [Weapon]";
		frequency = "Static";
		effect = "You learn the Moves Shadow Punch and Shadow Sneak. You may use these as Weapon Attacks when wielding Melee Weapons.";
		prereqs.put("Apparition", -1);
	}
	public Shadow_Arms(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apparition");
	}
}