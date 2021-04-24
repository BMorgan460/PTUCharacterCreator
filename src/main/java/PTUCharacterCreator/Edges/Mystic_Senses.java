package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Mystic_Senses extends Edge {
	{
		name = "Mystic Senses";
		effect = "You may use Intuition instead of Charm to improve the disposition of Wild Pokemon. You may not take Mystic Senses if you have the Elemental Connection Edge, and you may not take Elemental Connection if you have Mystic Senses.";
		prereqs.put("Intuition", 3);
	}
	public Mystic_Senses(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intuition",3) && true;
	}
}