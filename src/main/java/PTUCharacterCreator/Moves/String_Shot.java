package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class String_Shot extends Move {
	{
		name = "String Shot";
		effect = "Lower the Speed of all legal targets by -1 CS. If this lowers their Speed CS to -6, or if their Speed CS was already at -6, they are instead Stuck. *Grants Threaded";
		damageBase = 0;
		AC = 3;
		frequency = "At-Will";
		range = "Cone 2";
		type = "Bug";
		category = "Status";
	}
	public String_Shot(){}
}