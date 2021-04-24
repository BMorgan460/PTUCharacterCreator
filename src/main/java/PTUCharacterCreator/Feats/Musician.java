package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Musician extends Feature {
	{
		name = "Musician";
		tags = "[Class] [+Special Attack]";
		frequency = "Static";
		effect = "You may use Musician Songs. See Extras - Class Mechanics for details.";
		prereqs.put("Charm", 3);
		prereqs.put("Focus", 3);
	}
	public Musician(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",3) && t.checkSkillRank("Focus",3);
	}
}