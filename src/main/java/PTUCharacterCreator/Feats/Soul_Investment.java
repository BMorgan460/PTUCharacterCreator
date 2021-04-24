package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Soul_Investment extends Feature {
	{
		name = "Soul Investment";
		tags = "[+Special Attack][Weapon]";
		frequency = "Bind 2 AP - Extended Action";
		effect = "Target: Your Soul Bonded Weapon Effect: Choose one Novice and one Expert Arcane Weapon Move. Your Soul Bonded Weapon adds those Moves to your Move List as long as this Feature is Bound. You may only Bind one instance of this Feature at a time, and you may not have multiple instances of the same Move in your Move List.";
		prereqs.put("Arcanist", -1);
		prereqs.put("Ocu Edu", 6);
	}
	public Soul_Investment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Arcanist") && t.checkSkillRank("Ocu Edu",6);
	}
}