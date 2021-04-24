package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glamour_Weaver extends Feature {
	{
		name = "Glamour Weaver";
		tags = "[Class][+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Sweet Kiss and Disarming Voice.";
		prereqs.put("Elemental Connection (Fairy)", 0);
		prereqs.put("Charm", 3);
		prereqs.put("Ocu Edu", 3);
	}
	public Glamour_Weaver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",3) && t.checkSkillRank("Ocu Edu",3);
	}
}