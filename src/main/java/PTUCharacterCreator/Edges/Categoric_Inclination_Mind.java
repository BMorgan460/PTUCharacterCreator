package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Categoric_Inclination_Mind extends Edge {
	{
		name = "Categoric Inclination (Mind)";
		effect = "You gain a +1 Bonus to all Skill Checks of the Mind Category.";
		prereqs.put("-", 0);
	}
	public Categoric_Inclination_Mind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}