package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Elemental_Connection_Ice extends Edge {
	{
		name = "Elemental Connection (Ice)";
		effect = "You gain a +2 bonus to Charm, Command, Guile, Intimidate, and Intuition Checks targeting Pokemon of the Ice Type. You may not take Elemental Connection if you have the Mystic Senses Edge, and you may not take Mystic Senses if you have Elemental Connection.";
		prereqs.put("-", 0);
	}
	public Elemental_Connection_Ice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}