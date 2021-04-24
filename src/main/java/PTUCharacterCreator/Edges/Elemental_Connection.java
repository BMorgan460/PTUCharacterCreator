package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Elemental_Connection extends Edge {
	{
		name = "Elemental Connection";
		effect = "Choose an Elemental Type. You gain a +2 bonus to Charm, Command, Guile, Intimidate, and Intuition Checks targeting Pokemon of that Type. You may not take Elemental Connection if you have the Mystic Senses Edge, and you may not take Mystic Senses if you have Elemental Connection.";
		prereqs.put("-", 0);
	}
	public Elemental_Connection(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}