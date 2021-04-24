package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Categoric_Inclination_Body extends Edge {
	{
		name = "Categoric Inclination (Body)";
		effect = "You gain a +1 Bonus to all Skill Checks of the Body Category.";
		prereqs.put("-", 0);
	}
	public Categoric_Inclination_Body(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}