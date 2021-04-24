package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Mounted_Prowess extends Edge {
	{
		name = "Mounted Prowess";
		effect = "You automatically succeed at Acrobatics and Athletics Checks made to mount a Pokemon, and you gain a +3 Bonus to all Acrobatics and Athletics Checks made to remain Mounted.";
		prereqs.put("Acrobatics or Athletics", 3);
	}
	public Mounted_Prowess(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",3) || t.checkSkillRank("Athletics",3);
	}
}