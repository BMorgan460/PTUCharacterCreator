package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Categoric_Inclination_Spirit extends Edge {
	{
		name = "Categoric Inclination (Spirit)";
		effect = "You gain a +1 Bonus to all Skill Checks of the Spirit Category.";
		prereqs.put("-", 0);
	}
	public Categoric_Inclination_Spirit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}