package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rogue extends Feature {
	{
		name = "Rogue";
		tags = "[Class] [+Attack]";
		frequency = "Static";
		effect = "You learn the Moves Feint Attack and Thief. Note: Rogue Skills are Acrobatics, Athletics, and Stealth.";
		prereqs.put("Stealth, Acrobatics, Athletics", 3);
	}
	public Rogue(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Stealth", "Acrobatics", "Athletics"};
		return checkMultipleSkills(t,s,3,2);
	}
}